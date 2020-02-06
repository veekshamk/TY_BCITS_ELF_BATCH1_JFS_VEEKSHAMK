package com.bcits.discom.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "consumer_master")
public class ConsumerMasterBean implements Serializable{

	@Id
	@Column(name = "rr_number")
	private String rrNumber;
	@Column(name = "full_name")
	private String fullName;
	@Column
	private String email;
	@Column(name = "mobile_number")
	private long mobileNumber;
	@Column(name = "type_of_consumer")
	private String typeOfConsumer;
	@Column
	private String region;
	@Column
	private String password;
	@Column
	private String address;

}
