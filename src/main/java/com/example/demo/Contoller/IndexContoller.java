package com.example.demo.Contoller;

import com.example.demo.Entity.TestEntity1;
import com.example.demo.JPA.TestJpa1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import java.util.List;

/**
 * Created by Administrator on 2018/2/2.
 */
@Controller
@RequestMapping(value = "/test")
public class IndexContoller {

    @Autowired
    private TestJpa1 testJpa1;

    /**
     * 主页
     * @return
     */
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index() {
        System.out.println("打印网页");
        return "index";
    }

    /**
     * 登录
     * @return
     */
    @RequestMapping(value = "/login_view", method = RequestMethod.GET)
    public String login() {
        System.out.println("登录网页");
        return "login";
    }



}
