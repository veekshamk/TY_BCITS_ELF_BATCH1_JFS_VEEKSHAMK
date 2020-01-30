package com.bcits.springboot.beans;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRootName;

import lombok.Data;
@JsonRootName("EmployeeInfo")
@JsonPropertyOrder("empId")
@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
@Entity
@Table(name="EmployeeInfo")
public class EmployeeInfoBean {
	@JsonProperty("employeeID")
	@Id
	@Column
	private int empId;
	@Column
	private String name;
	@Column
	private long mobileNumber;
	@Column
	private String officialMailId;
	@Column
	private Date dob;
	@Column
	private Date doj;
	@Column
	private String designation;
	@Column
	private String bloodGroup;
	@Column
	private double salary;
	@Column
	private int deptId;
	@Column
	private int managerId;
	@Column
	private String password;

}
