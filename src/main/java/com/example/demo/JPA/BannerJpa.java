package com.example.demo.JPA;

import com.example.demo.Entity.BannerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.io.Serializable;

/**
 * Created by Administrator on 2018/3/8.
 */
public interface BannerJpa  extends JpaRepository<BannerEntity, Long>, JpaSpecificationExecutor<BannerEntity>, Serializable {
}
