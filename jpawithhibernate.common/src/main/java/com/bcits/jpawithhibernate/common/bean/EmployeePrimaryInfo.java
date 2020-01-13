package com.bcits.jpawithhibernate.common.bean;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.bcits.jpawithhibernate.many.to.many.ProjectInfo;
import com.bcits.jpawithhibernate.one.to.many.EmployeeAddressInfo;
import com.bcits.jpawithhibernate.one.to.one.EmployeeBankInfo;
import com.bcits.jpawithhibernate.one.to.one.EmployeeSecondaryInfo;

import lombok.Data;
import lombok.Setter;
import lombok.ToString.Exclude;
@Setter
@Data
@Entity
@Table(name="employee_primary_info")
public class EmployeePrimaryInfo implements Serializable{
	@Id
	private int emp_id;
	@Column
	private String name;
	@Column
	private long mobile_number;
	@Column
	private String official_mail_id;
	@Column
	private Date dob;
	@Column
	private Date doj;
	@Column
	private String designation;
	@Column
	private String blood_group;
	@Column
	private double salary;
	@Column
	private int dept_id;
	@Column
	private int manager_id;
	
	@Exclude
	@OneToOne(cascade=CascadeType.ALL,mappedBy="primary") //bidirectional
	private EmployeeSecondaryInfo secondary;
	
	@OneToOne(cascade=CascadeType.ALL, mappedBy="primary") //bidirectional
	private EmployeeBankInfo bank;
	
	@Exclude
	@OneToMany(cascade=CascadeType.ALL,mappedBy="primary")//bidirectional
	private List<EmployeeAddressInfo> addressinfo;
	
	@Exclude
	@ManyToMany(cascade=CascadeType.ALL, mappedBy="primaryinfo")
	private List<ProjectInfo> proInfo;
	
	
//	public EmployeeBankInfo getBank() {
//		return bank;
//	}
//	public void setBank(EmployeeBankInfo bank) {
//		this.bank = bank;
//	}
//	public EmployeeSecondaryInfo getSecondary() {
//		return secondary;
//	}
//	public void setSecondary(EmployeeSecondaryInfo secondary) {
//		this.secondary = secondary;
//	}
//	public int getEmp_id() {
//		return emp_id;
//	}
//	public void setEmp_id(int emp_id) {
//		this.emp_id = emp_id;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public long getMobile_number() {
//		return mobile_number;
//	}
//	public void setMobile_number(long mobile_number) {
//		this.mobile_number = mobile_number;
//	}
//	public String getOfficial_mail_id() {
//		return official_mail_id;
//	}
//	public void setOfficial_mail_id(String official_mail_id) {
//		this.official_mail_id = official_mail_id;
//	}
//	public Date getDob() {
//		return dob;
//	}
//	public void setDob(Date dob) {
//		this.dob = dob;
//	}
//	public Date getDoj() {
//		return doj;
//	}
//	public void setDoj(Date doj) {
//		this.doj = doj;
//	}
//	public String getDesignation() {
//		return designation;
//	}
//	public void setDesignation(String designation) {
//		this.designation = designation;
//	}
//	public String getBlood_group() {
//		return blood_group;
//	}
//	public void setBlood_group(String blood_group) {
//		this.blood_group = blood_group;
//	}
//	public double getSalary() {
//		return salary;
//	}
//	public void setSalary(double salary) {
//		this.salary = salary;
//	}
//	public int getDept_id() {
//		return dept_id;
//	}
//	public void setDept_id(int dept_id) {
//		this.dept_id = dept_id;
//	}
//	public int getManager_id() {
//		return manager_id;
//	}
//	public void setManager_id(int manager_id) {
//		this.manager_id = manager_id;
//	}
//	
	
	

}
