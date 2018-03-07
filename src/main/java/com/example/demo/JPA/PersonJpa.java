package com.example.demo.JPA;

import com.example.demo.Entity.PersonEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.io.Serializable;

/**
 * Created by Administrator on 2018/3/7.
 */
public interface PersonJpa extends JpaRepository<PersonEntity, Long>, JpaSpecificationExecutor<PersonEntity>, Serializable {
}
