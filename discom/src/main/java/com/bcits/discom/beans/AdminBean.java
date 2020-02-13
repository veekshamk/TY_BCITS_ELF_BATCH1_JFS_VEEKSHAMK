package com.bcits.discom.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table(name="admin_info")
public class AdminBean implements Serializable{
	@Id
	@Column
	private String email;
	@Column
	private String password;
}//End of Class
