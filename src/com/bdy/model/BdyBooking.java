package com.bdy.model;

// Generated 2014/5/15 �U�� 02:50:35 by Hibernate Tools 4.0.0

import java.util.Date;

/**
 * BdyBooking generated by hbm2java
 */
public class BdyBooking {

	private int bkId;
	private String bkName;
	private String bkPhone;
	private int tbId;
	private Date bkOrderdate;
	private Date bkEatdate;
	private String bkContent;
	private Integer bkState;
	private Integer bkNumber;
	private String empId;

	public BdyBooking() {
	}

	public BdyBooking(int bkId) {
		this.bkId = bkId;
	}

	public BdyBooking(int bkId, String bkName, String bkPhone,
			int tbId, Date bkOrderdate, Date bkEatdate,
			String bkContent, Integer bkState, Integer bkNumber,
			String empId) {
		this.bkId = bkId;
		this.bkName = bkName;
		this.bkPhone = bkPhone;
		this.bkOrderdate = bkOrderdate;
		this.bkEatdate = bkEatdate;
		this.bkContent = bkContent;
		this.bkState = bkState;
		this.tbId = tbId;
		this.bkNumber = bkNumber;
		this.empId = empId;
	}

	public int getTbId() {
		return tbId;
	}

	public void setTbId(int tbId) {
		this.tbId = tbId;
	}
	
	public int getBkId() {
		return this.bkId;
	}

	public void setBkId(int bkId) {
		this.bkId = bkId;
	}

	public String getBkName() {
		return this.bkName;
	}

	public void setBkName(String bkName) {
		this.bkName = bkName;
	}

	public String getBkPhone() {
		return this.bkPhone;
	}

	public void setBkPhone(String bkPhone) {
		this.bkPhone = bkPhone;
	}

	public Date getBkOrderdate() {
		return this.bkOrderdate;
	}

	public void setBkOrderdate(Date bkOrderdate) {
		this.bkOrderdate = bkOrderdate;
	}

	public Date getBkEatdate() {
		return this.bkEatdate;
	}

	public void setBkEatdate(Date bkEatdate) {
		this.bkEatdate = bkEatdate;
	}

	public String getBkContent() {
		return this.bkContent;
	}

	public void setBkContent(String bkContent) {
		this.bkContent = bkContent;
	}

	public Integer getBkState() {
		return this.bkState;
	}

	public void setBkState(Integer bkState) {
		this.bkState = bkState;
	}

	public Integer getBkNumber() {
		return this.bkNumber;
	}

	public void setBkNumber(Integer bkNumber) {
		this.bkNumber = bkNumber;
	}

	public String getEmpId() {
		return this.empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

}
