package com.oss.shop.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.oss.shop.model.School;

@Repository
public interface SchoolRepo extends JpaRepository<School, Long> {
}
