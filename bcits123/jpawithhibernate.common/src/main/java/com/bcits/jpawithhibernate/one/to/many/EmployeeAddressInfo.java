package com.bcits.jpawithhibernate.one.to.many;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

import com.bcits.jpawithhibernate.common.bean.EmployeePrimaryInfo;

import lombok.Data;
@Data
@Entity
@Table(name="Employee_Address_Info")

public class EmployeeAddressInfo implements Serializable{
	@EmbeddedId
	private EmployeeAddressPK address;
	@Column
	private String house_number;
	@Column
	private String address1;
	@Column
	private String address2;
	@Column
	private String landmark;
	@Column
	private String city;
	@Column
	private long pincode;
	
	@MapsId("emp_id")
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="emp_id")
	private EmployeePrimaryInfo primary;

}
