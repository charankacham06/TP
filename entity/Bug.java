package com.bugtrackingsystem.entity;



import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import com.bugtrackingsystem.util.BugStatus;
import com.bugtrackingsystem.util.Severity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Table(name="Bugs")
@Entity
public class Bug {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="bid")
	private Integer bugId;
	@Column(name="btitle")
	private String bugTitle;
	@Column(name="bDesc")
	private String bugDescription;
	@Column(name="bseverity")
	private Severity severity;
	@Column(name="createdby")
	private TestEngineer createdBy;
	@Column(name="assignto")
	private Developer assignTo;
	@Column(name="bstatus")
	private BugStatus status;
	@Column(name="startdate")
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private LocalDate startDate;
	@Column(name="lastdate")
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private LocalDate lastUpdatedDate;
	@Column(name="projects")
	private Project project;
}
