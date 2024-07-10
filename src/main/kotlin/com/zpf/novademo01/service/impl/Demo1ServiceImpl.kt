package com.zpf.novademo01.service.impl

import com.zpf.novademo01.service.Demo1Service
import com.zpf.novademo01.util.R
import com.zpf.novademo01.vo.Demo1Vo
import org.jooq.DSLContext
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.jooq.generated.Tables.DEMO1
import org.jooq.generated.tables.pojos.Demo1

/**
 * @ClassName:      Demo1ServiceImpl
 * @Author:     pengfeizhang
 * @Description:  实现类
 * @Date:    2024/7/10 15:17
 * @Version:    1.0
 */
@Service
class Demo1ServiceImpl : Demo1Service {


    @Autowired
    lateinit var dslContext: DSLContext


    override fun insert(demo1Vo: Demo1Vo): R<*> {
        var line = dslContext
                .insertInto(DEMO1)
                .set(DEMO1.NAME,demo1Vo.name)
                .execute()
        return R.ok(line,"插入成功")

    }

    override fun update(demo1Vo: Demo1Vo): R<*> {
        var line = dslContext
                .update(DEMO1)
                .set(DEMO1.NAME,demo1Vo.name)
                .where(DEMO1.ID.eq(demo1Vo.id))
                .execute()
        return R.ok(line,"更新成功")
    }

    override fun remove(demo1Vo: Demo1Vo): R<*> {
        var line = dslContext
                .delete(DEMO1)
                .where(DEMO1.ID.eq(demo1Vo.id))
                .execute()
        return R.ok(line,"删除成功")

    }

    override fun get(id: Int): R<*> {
        val demo = dslContext!!
                .select()
                .from(DEMO1)
                .where(DEMO1.ID.eq(id))
                .fetchOne()?.into(Demo1::class.java)
        return R.ok(demo,"成功")


    }

    override fun list(): R<*> {
        val demoMap: Map<Int, Demo1> = dslContext.select().from(DEMO1)
                .fetchMap(DEMO1.ID, Demo1::class.java)
        return R.ok(demoMap,"成功")
    }
}