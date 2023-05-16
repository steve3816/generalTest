package com.steve.generalTest.repository;

import com.steve.generalTest.entity.Class;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClassRepository extends JpaRepository<Class, Long> {
}
