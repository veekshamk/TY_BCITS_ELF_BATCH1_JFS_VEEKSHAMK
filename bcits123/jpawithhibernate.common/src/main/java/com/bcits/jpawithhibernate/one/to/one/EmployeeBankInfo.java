package com.bcits.jpawithhibernate.one.to.one;

import java.io.Serializable;

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
@Table(name="Employee_bank_info")
public class EmployeeBankInfo implements Serializable{
	@Id
	private int emp_id;
	@Column
	private long account_number;
	@Column
	private String bank_name;
	@Column
	private String Branch_name;
	@Column
	private String ifsc_code;
	
	@MapsId
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="emp_id")
	private EmployeePrimaryInfo primaryInfo;
	
//	public EmployeePrimaryInfo getPrimary() {
//		return primary;
//	}
//	public void setPrimary(EmployeePrimaryInfo primary) {
//		this.primary = primary;
//	}
//	public int getEmp_id() {
//		return emp_id;
//	}
//	public void setEmp_id(int emp_id) {
//		this.emp_id = emp_id;
//	}
//	public long getAccount_number() {
//		return account_number;
//	}
//	public void setAccount_number(long account_number) {
//		this.account_number = account_number;
//	}
//	public String getBank_name() {
//		return bank_name;
//	}
//	public void setBank_name(String bank_name) {
//		this.bank_name = bank_name;
//	}
//	public String getBranch_name() {
//		return Branch_name;
//	}
//	public void setBranch_name(String branch_name) {
//		Branch_name = branch_name;
//	}
//	public String getIfsc_code() {
//		return ifsc_code;
//	}
//	public void setIfsc_code(String ifsc_code) {
//		this.ifsc_code = ifsc_code;
//	}
//	

}
