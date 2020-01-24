package com.bcits.hibernate.practice;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table(name="Employee_Info")

public class EmployeeInfo implements Serializable {
	@Id
	private int id;
	@Column
	private String name;
	@Column
	private int dept_id;
	@Column
	private String email;
	@Column
	private String designation;
	@Column
	private long phone_num;
	

}