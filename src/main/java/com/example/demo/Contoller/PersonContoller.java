package com.example.demo.Contoller;

import com.alibaba.fastjson.JSON;
import com.example.demo.Entity.PersonEntity;
import com.example.demo.Entity.RustleEntity;
import com.example.demo.JPA.PersonJpa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by Administrator on 2018/3/7.
 */
@RestController
@RequestMapping(value = "main", produces = "application/json;charset=utf-8")
public class PersonContoller {

    @Autowired
    private PersonJpa personJpa;

    @RequestMapping(value = "/person")
    public JSON person(HttpServletRequest httpServletRequest) {
        RustleEntity rustleEntity = new RustleEntity();
        List<PersonEntity> personEntityList = personJpa.findAll();
        rustleEntity.setMsg("200");
        rustleEntity.setResult("获取成功");
        rustleEntity.setUrl_image((JSON) JSON.toJSON(personEntityList));
        return (JSON) JSON.toJSON(rustleEntity);
    }

}
