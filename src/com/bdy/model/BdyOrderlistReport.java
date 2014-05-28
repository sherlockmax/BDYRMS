package com.bdy.model;

// Generated 2014/5/28 �U�� 02:06:32 by Hibernate Tools 4.0.0

/**
 * BdyOrderlistReport generated by hbm2java
 */
public class BdyOrderlistReport implements java.io.Serializable {

	private int odlistId;
	private BdyBillHistory bdyBillHistory;
	private Integer odId;
	private String odEmpId;
	private String odEmpName;
	private String foodName;
	private Double foodPrice;
	private String setName;
	private Double setPrice;
	private String foodkindName;
	private String mainkindName;
	private Double addmoney;

	public BdyOrderlistReport() {
	}

	public BdyOrderlistReport(int odlistId) {
		this.odlistId = odlistId;
	}

	public BdyOrderlistReport(int odlistId, BdyBillHistory bdyBillHistory,
			Integer odId, String odEmpId, String odEmpName, String foodName,
			Double foodPrice, String setName, Double setPrice,
			String foodkindName, String mainkindName, Double addmoney) {
		this.odlistId = odlistId;
		this.bdyBillHistory = bdyBillHistory;
		this.odId = odId;
		this.odEmpId = odEmpId;
		this.odEmpName = odEmpName;
		this.foodName = foodName;
		this.foodPrice = foodPrice;
		this.setName = setName;
		this.setPrice = setPrice;
		this.foodkindName = foodkindName;
		this.mainkindName = mainkindName;
		this.addmoney = addmoney;
	}

	public int getOdlistId() {
		return this.odlistId;
	}

	public void setOdlistId(int odlistId) {
		this.odlistId = odlistId;
	}

	public BdyBillHistory getBdyBillHistory() {
		return this.bdyBillHistory;
	}

	public void setBdyBillHistory(BdyBillHistory bdyBillHistory) {
		this.bdyBillHistory = bdyBillHistory;
	}

	public Integer getOdId() {
		return this.odId;
	}

	public void setOdId(Integer odId) {
		this.odId = odId;
	}

	public String getOdEmpId() {
		return this.odEmpId;
	}

	public void setOdEmpId(String odEmpId) {
		this.odEmpId = odEmpId;
	}

	public String getOdEmpName() {
		return this.odEmpName;
	}

	public void setOdEmpName(String odEmpName) {
		this.odEmpName = odEmpName;
	}

	public String getFoodName() {
		return this.foodName;
	}

	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}

	public Double getFoodPrice() {
		return this.foodPrice;
	}

	public void setFoodPrice(Double foodPrice) {
		this.foodPrice = foodPrice;
	}

	public String getSetName() {
		return this.setName;
	}

	public void setSetName(String setName) {
		this.setName = setName;
	}

	public Double getSetPrice() {
		return this.setPrice;
	}

	public void setSetPrice(Double setPrice) {
		this.setPrice = setPrice;
	}

	public String getFoodkindName() {
		return this.foodkindName;
	}

	public void setFoodkindName(String foodkindName) {
		this.foodkindName = foodkindName;
	}

	public String getMainkindName() {
		return this.mainkindName;
	}

	public void setMainkindName(String mainkindName) {
		this.mainkindName = mainkindName;
	}

	public Double getAddmoney() {
		return this.addmoney;
	}

	public void setAddmoney(Double addmoney) {
		this.addmoney = addmoney;
	}

}
