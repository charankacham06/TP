package com.bugtrackingsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bugtrackingsystem.entity.Developer;






@Repository
public interface DeveloperRepository extends JpaRepository<Developer,Integer>{

}
