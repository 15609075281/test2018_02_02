package com.example.demo.Entity;

import com.alibaba.fastjson.JSON;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Administrator on 2018/2/27.
 */
public class RustleEntity implements Serializable {

    private String msg;
    private String result;
    private JSON url_image;
    private List<RustleListEntity> jsonlist;


    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public JSON getUrl_image() {
        return url_image;
    }

    public void setUrl_image(JSON url_image) {
        this.url_image = url_image;
    }

    public List<RustleListEntity> getJsonlist() {
        return jsonlist;
    }

    public void setJsonlist(List<RustleListEntity> jsonlist) {
        this.jsonlist = jsonlist;
    }

    @Override
    public String toString() {
        return "RustleEntity{" +
                "msg='" + msg + '\'' +
                ", result='" + result + '\'' +
                ", url_image=" + url_image +
                ", jsonlist=" + jsonlist +
                '}';
    }
}
