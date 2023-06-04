package com.camilo.myspringproject.repository;

import com.camilo.myspringproject.model.Test;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITestRepository extends JpaRepository<Test, Long> {
}
