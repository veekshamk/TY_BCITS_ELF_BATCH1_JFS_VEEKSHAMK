package com.bcits.jpawithhibernate.many.to.many;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.bcits.jpawithhibernate.common.bean.EmployeePrimaryInfo;

import lombok.Data;
@Data
@Entity
@Table(name="project_info")
public class ProjectInfo implements Serializable{
	@Id
	@Column
	private int proj_id;
	@Column
	private String proj_name;
	@Column
	private String technology;
	@Column
	private Date start_date;
	@Column
	private Date end_date;
	@Column
	private String location;
	
	@JoinColumn
	@ManyToMany(cascade= CascadeType.ALL)
	@JoinTable(name="employee_proj_info", joinColumns=@JoinColumn(name="proj_id")
	, inverseJoinColumns=@JoinColumn(name="emp_id"))
	private List<EmployeePrimaryInfo> primaryinfo;
	

}
