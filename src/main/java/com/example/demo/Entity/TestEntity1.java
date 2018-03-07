package com.example.demo.Entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Administrator on 2018/2/2.
 */
@Entity
@Table(name = "login")
public class TestEntity1 implements Serializable {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private long id;

    @Column(name = "username")
    private String name;
    @Column(name = "password")
    private String password;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "TestEntity1{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
