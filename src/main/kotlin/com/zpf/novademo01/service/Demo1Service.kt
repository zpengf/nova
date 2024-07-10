package com.zpf.novademo01.service

import com.zpf.novademo01.util.R
import com.zpf.novademo01.vo.Demo1Vo

/**
 * @ClassName:      Demo1Service
 * @Author:     pengfeizhang
 * @Description:  service服务层接口
 * @Date:    2024/7/10 15:14
 * @Version:    1.0
 */
interface Demo1Service {

    /**
     * 新增
     */
    fun insert(demo1Vo: Demo1Vo): R<*>

    /**
     * 更新
     */
    fun update(demo1Vo: Demo1Vo): R<*>

    /**
     * 通过id删除
     */
    fun remove(id: Int): R<*>

    /**
     * 查询
     */
    fun get(id: Int): R<*>

    /**
     * 查询全部
     */
    fun list(): R<*>
}