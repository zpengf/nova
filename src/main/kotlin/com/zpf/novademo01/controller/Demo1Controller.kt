package com.zpf.novademo01.controller

import com.zpf.novademo01.service.Demo1Service
import com.zpf.novademo01.util.R
import com.zpf.novademo01.vo.Demo1Vo
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

/**
 * @ClassName:      Demo1Controller
 * @Author:     pengfeizhang
 * @Description:  controller层
 * @Date:    2024/7/10 15:12
 * @Version:    1.0
 */
@RestController
@RequestMapping("/demo")
@CrossOrigin
class Demo1Controller {

    @Autowired
    lateinit var demo1Service: Demo1Service

    @GetMapping
    fun getOne(id:Int): R<*> {
        return demo1Service.get(id)
    }

    @DeleteMapping
    fun deleteOne(@RequestBody demo1Vo: Demo1Vo):R<*>{
        return demo1Service.remove(demo1Vo)
    }

    @PostMapping
    fun insertOne(@RequestBody demo1Vo: Demo1Vo):R<*>{
        return demo1Service.insert(demo1Vo)
    }

    @PutMapping
    fun updateOne(@RequestBody demo1Vo: Demo1Vo):R<*> {
        return demo1Service.update(demo1Vo)
    }

    @GetMapping("/all")
    fun getAll():R<*>{
        return demo1Service.list()
    }


}