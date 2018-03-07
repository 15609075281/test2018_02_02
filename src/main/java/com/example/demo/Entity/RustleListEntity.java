package com.example.demo.Entity;

import com.alibaba.fastjson.JSON;

/**
 * Created by Administrator on 2018/3/6.
 */
public class RustleListEntity {


    private String id;
    private JSON json;
    private String title;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public JSON getJson() {
        return json;
    }

    public void setJson(JSON json) {
        this.json = json;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "RustleListEntity{" +
                "id='" + id + '\'' +
                ", json=" + json +
                ", title='" + title + '\'' +
                '}';
    }
}
