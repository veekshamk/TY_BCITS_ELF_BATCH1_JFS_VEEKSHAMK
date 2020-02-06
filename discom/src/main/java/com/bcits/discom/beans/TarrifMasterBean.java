package com.bcits.discom.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="Tarrif_Master")
public class TarrifMasterBean implements Serializable {
	@Id
	@Column(name="rr_number")
	private String rrNumber;
	@Column(name = "type_of_consumer")
	private String typeOfConsumer;
	@Column(name="units_consumed")
	private double unitsConsumed;
	@Column(name="bill_amount")
	private double billAmount;
}