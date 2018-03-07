package com.example.demo.Entity;


import javax.persistence.*;

/**
 * Created by Administrator on 2018/3/2.
 * 首页列表数据
 */
@Entity
@Table(name = "homelist")
public class HomeEntity {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;

    @Column(name = "image_url")
    private String image_url;

    @Column(name = "text_title")
    private String text_title;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    public String getText_title() {
        return text_title;
    }

    public void setText_title(String text_title) {
        this.text_title = text_title;
    }

    @Override
    public String toString() {
        return "HomeEntity{" +
                "id=" + id +
                ", image_url='" + image_url + '\'' +
                ", text_title='" + text_title + '\'' +
                '}';
    }
}
