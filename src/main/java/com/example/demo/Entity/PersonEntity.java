package com.example.demo.Entity;

import javax.persistence.*;

/**
 * Created by Administrator on 2018/3/7.
 */
@Entity
@Table(name = "person")
public class PersonEntity {


    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;

    @Column(name = "image_url")
    private String image_url;
    @Column(name = "text_")
    private String text_;

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

    public String getText_() {
        return text_;
    }

    public void setText_(String text_) {
        this.text_ = text_;
    }

    @Override
    public String toString() {
        return "PersonEntity{" +
                "id=" + id +
                ", image_url='" + image_url + '\'' +
                ", text_='" + text_ + '\'' +
                '}';
    }
}
