package com.bugtrackingsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bugtrackingsystem.entity.TestEngineer;




@Repository
public interface TestEngineerRepository extends JpaRepository<TestEngineer,Integer>{

}
