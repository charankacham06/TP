package com.bugtrackingsystem.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity

@Table(name="Developer")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)

public class Developer extends User {
	@Column(name="devname")
	private String devName;
	@Column(name="devSkill")
	private String devSkill;
	@OneToMany
	private List<Project> project;
}
