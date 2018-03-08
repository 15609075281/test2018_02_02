package com.example.demo.Contoller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.example.demo.Entity.BannerEntity;
import com.example.demo.Entity.HomeEntity;
import com.example.demo.Entity.RustleEntity;
import com.example.demo.Entity.RustleListEntity;
import com.example.demo.JPA.BannerJpa;
import com.example.demo.JPA.HomeJpa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2018/3/2.
 */
@RestController
@RequestMapping(value = "main", produces = "application/json; charset=utf-8")
public class HomeContoller {

    @Autowired
    private HomeJpa homeJpa;


    @RequestMapping(value = "/home")
    public JSON home(HomeEntity homeEntity, HttpServletRequest httpServletRequest) {
        System.out.println("进出home");
        //查出数据
        List<HomeEntity> homeEntityList = homeJpa.findAll();
        //最外层
        RustleEntity rustleEntity = new RustleEntity();
        rustleEntity.setMsg("200");
        rustleEntity.setResult("成功");
        //第二层，集合
        List<RustleListEntity> jsonList = new ArrayList<>();
        String[] title = new String[]{"最近新品", "限时优惠", "不老神话", "独家精品", "独家精品", "独家精品", "独家精品", "独家精品"};
        for (int i = 0; i < title.length; i++) {
            RustleListEntity rustleListEntity = new RustleListEntity();
            rustleListEntity.setId(i + "");
            rustleListEntity.setTitle(title[i]);
            rustleListEntity.setJson((JSON) JSONObject.toJSON(homeEntityList));
            jsonList.add(rustleListEntity);
        }
        //第一层装入集合
        rustleEntity.setJsonlist(jsonList);
//        rustleEntity.setUrl_image((JSON) JSONObject.toJSON(homeEntityList));
        return (JSON) JSONObject.toJSON(rustleEntity);
    }



}
