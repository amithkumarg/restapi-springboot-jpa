package com.oss.shop.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.oss.shop.model.District;

public interface DistrictRepo extends JpaRepository<District, Long> {
}
