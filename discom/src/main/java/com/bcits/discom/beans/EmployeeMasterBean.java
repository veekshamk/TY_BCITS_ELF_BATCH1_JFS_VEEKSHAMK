package com.bcits.discom.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="employee_master")
public class EmployeeMasterBean implements Serializable{
	@Id
	@Column(name="emp_id")
	private int empId;
	@Column(name="emp_name")
	private String employeeName;
	@Column
	private String password;
	@Column
	private String region;
	@Column
	private String designation;
}
