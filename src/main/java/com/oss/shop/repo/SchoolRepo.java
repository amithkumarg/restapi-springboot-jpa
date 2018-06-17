package com.oss.shop.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.oss.shop.model.School;

public interface SchoolRepo extends JpaRepository<School, Long> {
}
