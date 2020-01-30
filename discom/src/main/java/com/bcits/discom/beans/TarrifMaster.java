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
public class TarrifMaster implements Serializable {
	@Id
	@Column
	private String meterNumber;
	@Column
	private String typeOfConsumer;
	@Column
	private double unitsConsumed;
	@Column
	private double totalAmount;
	

}
