package com.company.base.repository;

import com.company.base.model.Base;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBaseRepo extends JpaRepository<Base, Integer> {
}
