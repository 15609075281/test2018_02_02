package com.example.demo.JPA;

import com.example.demo.Entity.TestEntity1;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.io.Serializable;

/**
 * Created by Administrator on 2018/2/2.
 */
public interface TestJpa1 extends JpaRepository<TestEntity1, Long>, JpaSpecificationExecutor<TestEntity1>, Serializable {

}
