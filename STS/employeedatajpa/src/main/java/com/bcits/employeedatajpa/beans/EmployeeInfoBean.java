package com.bcits.employeedatajpa.beans;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.NamedQuery;

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
@Table(name="employee_primary_info")
public class EmployeeInfoBean {
	@JsonProperty("employeeID")
	@Id
	@Column
	private Integer empId;
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
	private Double salary;
	@Column
	private Integer deptId;
	@Column
	private Integer managerId;
	@Column
	private String password;

}
