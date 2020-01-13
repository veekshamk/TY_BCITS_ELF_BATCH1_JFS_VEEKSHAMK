package com.bcits.jpawithhibernate.one.to.one;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.bcits.jpawithhibernate.common.bean.EmployeePrimaryInfo;

import lombok.Data;
@Data
@Entity
@Table(name="Employee_secondary_info")
public class EmployeeSecondaryInfo {
	@Id
	private int emp_id;
	@Column
	private String personal_mail_id;
	@Column
	private String gender;
	@Column
	private int age;
	@Column
	private String nationality;
	@Column
	private String is_married;
	@Column
	private long government_id;
	@Column
	private String guardian_name;
	@Column
	private long guardian_contact_number;
	@Column
	private String job_location;
	
	@MapsId
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="emp_id")
	private EmployeePrimaryInfo primary;
	
	
	
//	public int getEmp_id() {
//		return emp_id;
//	}
//
//	public void setEmp_id(int emp_id) {
//		this.emp_id = emp_id;
//	}
//
//	public String getPersonal_mail_id() {
//		return personal_mail_id;
//	}
//
//	public void setPersonal_mail_id(String personal_mail_id) {
//		this.personal_mail_id = personal_mail_id;
//	}
//
//	public String getGender() {
//		return gender;
//	}
//
//	public void setGender(String gender) {
//		this.gender = gender;
//	}
//
//	public int getAge() {
//		return age;
//	}
//
//	public void setAge(int age) {
//		this.age = age;
//	}
//
//	public String getNationality() {
//		return nationality;
//	}
//
//	public void setNationality(String nationality) {
//		this.nationality = nationality;
//	}
//
//	public String getIs_married() {
//		return is_married;
//	}
//
//	public void setIs_married(String is_married) {
//		this.is_married = is_married;
//	}
//
//	public long getGovernment_id() {
//		return government_id;
//	}
//
//	public void setGovernment_id(long government_id) {
//		this.government_id = government_id;
//	}
//
//	public String getGuardian_name() {
//		return guardian_name;
//	}
//
//	public void setGuardian_name(String guardian_name) {
//		this.guardian_name = guardian_name;
//	}
//
//	public long getGuardian_contact_number() {
//		return guardian_contact_number;
//	}
//
//	public void setGuardian_contact_number(long guardian_contact_number) {
//		this.guardian_contact_number = guardian_contact_number;
//	}
//
//	public String getJob_location() {
//		return job_location;
//	}
//
//	public void setJob_location(String job_location) {
//		this.job_location = job_location;
//	}
//
//	public EmployeePrimaryInfo getPrimary() {
//		return primary;
//	}
//
//	public void setPrimary(EmployeePrimaryInfo primary) {
//		this.primary = primary;
//	}


	

}
