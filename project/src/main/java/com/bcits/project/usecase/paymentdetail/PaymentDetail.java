package com.bcits.project.usecase.paymentdetail;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table(name="Payment_Detail")
public class PaymentDetail implements Serializable{
	@Id
	@Column
	private String meterNumber;
	@Column
	private double unitsConsumed;
	@Column
	private double totalAmount;
	@Column
	private String status;

}
