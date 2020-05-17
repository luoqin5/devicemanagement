package com.example.devicemanagement.dao;

import com.example.devicemanagement.domain.Test;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface TestDAO extends JpaRepository<Test, Long>,
        JpaSpecificationExecutor<Test> {

      Test  findByName(String name);
}
