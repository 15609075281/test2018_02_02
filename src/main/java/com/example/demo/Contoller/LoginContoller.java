package com.example.demo.Contoller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.example.demo.Entity.RustleEntity;
import com.example.demo.Entity.TestEntity1;
import com.example.demo.JPA.TestJpa1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import javax.servlet.http.HttpServletRequest;


/**
 * Created by Administrator on 2018/2/2.
 */
@RestController
@RequestMapping(value = "test", produces = "application/json; charset=utf-8")
public class LoginContoller {


    @Autowired
    private TestJpa1 testJpa1;

    /**
     * 登录页面
     *
     * @return
     */
    @RequestMapping(value = "/login")//
    public JSON login(TestEntity1 testEntity1, HttpServletRequest request) {
        System.out.println(testEntity1.toString());

        boolean flag = true;
        String result = "登陆成功";
        String msg = "200";
        //查询数据库用户是否存在
        TestEntity1 testEntity11 = testJpa1.findOne(new Specification<TestEntity1>() {
            @Override
            public Predicate toPredicate(Root<TestEntity1> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {
                criteriaQuery.where(criteriaBuilder.equal(root.get("name"), testEntity1.getName()));
                return null;
            }
        });

        if (testEntity11 == null) {
            flag = false;
            result = "用户不存在";
            msg = "500";
        } else {
            System.out.println(testEntity11.toString());
            if (!testEntity11.getPassword().equals(testEntity1.getPassword())) {
                flag = false;
                result = "用户密码错误，登陆失败";
                msg = "501";
            }
        }
        if (flag) {
            request.getSession().setAttribute("session", testEntity11);
        }
        RustleEntity rustleEntity = new RustleEntity();
        rustleEntity.setMsg(msg);
        rustleEntity.setResult(result);

        return (JSON) JSONObject.toJSON(rustleEntity);
    }

    @RequestMapping(value = "/register", produces = "application/json; charset=utf-8")
    public JSON register(TestEntity1 testEntity1, HttpServletRequest httpServletRequest) {
        System.out.println(testEntity1.toString());
        String msg = "200";
        String result = "注册成功";
        //查询数据库是否存在该用户
        TestEntity1 testEntity11 = testJpa1.findOne(new Specification<TestEntity1>() {
            @Override
            public Predicate toPredicate(Root<TestEntity1> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
                query.where(cb.equal(root.get("name"), testEntity1.getName()));
                return null;
            }
        });
        if (testEntity11 != null) {
            if (testEntity11.getName().equals(testEntity1.getName())) {
                msg = "500";
                result = "用户已存在";
            } else {
                msg = "501";
                result = "注册失败";
            }
        } else {
            testJpa1.save(testEntity1);
        }
        RustleEntity rustleEntity = new RustleEntity();
        rustleEntity.setMsg(msg);
        rustleEntity.setResult(result);
        System.out.println((JSON) JSONObject.toJSON(rustleEntity));
        return (JSON) JSONObject.toJSON(rustleEntity);
    }
}
