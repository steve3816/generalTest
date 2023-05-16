package com.steve.generalTest.repository;

import com.steve.generalTest.entity.School;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SchoolRepository extends JpaRepository<School, Long> {
}
