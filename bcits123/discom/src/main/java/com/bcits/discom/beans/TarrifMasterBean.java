package com.bcits.discom.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="tarrif_master")
public class TarrifMasterBean implements Serializable {

	@EmbeddedId
	private TarrifPK tarrifpk;
	@Column
	private double amount;
}//End of Class
