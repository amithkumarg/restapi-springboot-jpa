package com.oss.shop.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.oss.shop.model.School;

import java.util.List;

@Repository
public interface SchoolRepo extends JpaRepository<School, Long> {
    @Query(value = "from #{#entityName} where id in (:ids) or :ids is null")
    List<School> findSchoolByIdIn(@Param("ids") List<Long> ids);
}
