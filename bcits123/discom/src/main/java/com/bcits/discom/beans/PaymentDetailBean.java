package com.bcits.discom.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="Payment_Detail")
public class PaymentDetailBean implements Serializable{
	@Id
	@Column
	private String rrNumber;
	@Column
	private double totalAmount;
	@Column
	private String status;

}
