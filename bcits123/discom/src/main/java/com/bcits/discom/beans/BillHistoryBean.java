package com.bcits.discom.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="bill_history")
public class BillHistoryBean implements Serializable {
	@EmbeddedId
	private BillHistoryPK history;
	@Column
	private String status;
	@Column(name="total_amount")
	private double totalAmount;
	
}
