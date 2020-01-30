package com.bcits.discom.beans;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table(name="Bill_History")
public class BillHistory implements Serializable {
	@EmbeddedId
	private BillHistoryPK history;
	@Column
	private String status;
	@Column
	private double unitsConsumed;
	@Column
	private double totalAmount;
	@Column
	private double dueAmount;
	

}
