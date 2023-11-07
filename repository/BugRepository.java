package com.bugtrackingsystem.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.bugtrackingsystem.entity.Bug;
@Repository
public interface BugRepository extends JpaRepository<Bug,Integer>{
	
	

}
