package com.example.demo.JPA;

import com.example.demo.Entity.HomeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.io.Serializable;

/**
 * Created by Administrator on 2018/3/5.
 */
public interface HomeJpa extends JpaRepository<HomeEntity, Long>, JpaSpecificationExecutor<HomeEntity>, Serializable {
}
