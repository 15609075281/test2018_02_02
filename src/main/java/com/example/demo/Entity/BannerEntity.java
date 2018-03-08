package com.example.demo.Entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Administrator on 2018/3/8.
 * Banner
 */

@Entity
@Table(name = "banner")
public class BannerEntity implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;

    @Column(name = "image_url")
    private String image_url;

    @Column(name = "text_title")
    private String text_name;

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

    public String getText_name() {
        return text_name;
    }

    public void setText_name(String text_name) {
        this.text_name = text_name;
    }

    @Override
    public String toString() {
        return "BannerEntity{" +
                "id=" + id +
                ", image_url='" + image_url + '\'' +
                ", text_name='" + text_name + '\'' +
                '}';
    }
}
