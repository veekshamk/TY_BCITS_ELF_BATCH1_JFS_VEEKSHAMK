package com.bcits.springrestjaxb.beans;

import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonRootName;

import lombok.Data;
@Data
@XmlRootElement(name="user-info")
@XmlAccessorType(XmlAccessType.FIELD)
@JsonRootName("UserInfo")
public class UserInfoBean {
	
	@XmlAttribute(name="employee-id")
	@JsonProperty("employeeID")
	private int empId;
	//@XmlElement
	@XmlAttribute
	private String name;
	@XmlElement(name="mobile-number")
	private long mobileNumber;
	@XmlElement(name="mail-id")
	private String officialMailId;
	@XmlElement
	private Date dob;
	@XmlElement
	private Date doj;
	@XmlElement
	private String designation;
	@XmlElement(name="blood-group")
	private String bloodGroup;
	@XmlElement
	private double salary;
	@XmlElement(name="dept-id")
	private int deptId;
	@XmlElement(name="manager-id")
	private int managerId;
	//@XmlElement //To avoid bind to XML file
	@XmlTransient
	@JsonIgnore
	private String password;
	
	@JsonProperty("user-other-info")
	@XmlElement(name="user-other-info")
	UserOtherInfoBean userOtherInfoBean;
	
	@JsonProperty("user-address-list")
	@XmlElementWrapper(name="user-address-list")
	private List<UserAddressBean> userAddressBean;

}
