package com.example.demo.Contoller;

import com.alibaba.fastjson.JSON;
import com.example.demo.Entity.BannerEntity;
import com.example.demo.Entity.RustleEntity;
import com.example.demo.JPA.BannerJpa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by Administrator on 2018/3/8.
 */
@RestController
@RequestMapping(value = "main", produces = "application/json; charset=utf-8")
public class BannerContoler {
    @Autowired
    private BannerJpa  bannerEntityBannerJpa;

    @RequestMapping(value = "/home/banner")
    public JSON Banner(HttpServletRequest httpServletRequest) {
        List<BannerEntity> list = bannerEntityBannerJpa.findAll();
        RustleEntity rustleEntity = new RustleEntity();
        rustleEntity.setMsg("200");
        rustleEntity.setResult("获取成功");
        rustleEntity.setUrl_image((JSON) JSON.toJSON(list));
        return (JSON) JSON.toJSON(rustleEntity);
    }
}
