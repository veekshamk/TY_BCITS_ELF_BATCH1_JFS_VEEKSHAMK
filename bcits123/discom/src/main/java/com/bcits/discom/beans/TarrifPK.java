package com.bcits.discom.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.Data;

@Data
@Embeddable
public class TarrifPK implements Serializable{
	
	@Column(name = "type_of_consumer")
	private String typeOfConsumer;
	@Column
	private Long range;

}
