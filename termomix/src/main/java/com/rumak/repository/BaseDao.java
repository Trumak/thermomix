package com.rumak.repository;

import com.rumak.domain.BaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;

/**
 * Created by tomasz on 25.03.17.
 */
public interface BaseDao<T extends BaseEntity, U extends Serializable> extends JpaRepository<T, U> {
   }
