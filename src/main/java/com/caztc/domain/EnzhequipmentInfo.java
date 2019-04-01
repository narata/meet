package com.caztc.domain;

import java.util.Date;

/**
 * 设备信息的实体类
 * 
 * @author Administrator
 * 
 */
public class EnzhequipmentInfo {

	private String userName;

	private String meetingroomName;


	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column enzhequipment_info.enzhequipment_id
	 * 
	 * @mbggenerated Wed May 21 13:51:45 CST 2014
	 */
	private Integer enzhequipmentId;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column enzhequipment_info.user_id
	 * 
	 * @mbggenerated Wed May 21 13:51:45 CST 2014
	 */
	private String userId;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column enzhequipment_info.meetingroom_id
	 * 
	 * @mbggenerated Wed May 21 13:51:45 CST 2014
	 */
	private Integer meetingroomId;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column enzhequipment_info.enzhequipment_name
	 * 
	 * @mbggenerated Wed May 21 13:51:45 CST 2014
	 */
	private String enzhequipmentName;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column enzhequipment_info.procurement_time
	 * 
	 * @mbggenerated Wed May 21 13:51:45 CST 2014
	 */
	private Date procurementTime;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column enzhequipment_info.enzhequipment_price
	 * 
	 * @mbggenerated Wed May 21 13:51:45 CST 2014
	 */
	private Double enzhequipmentPrice;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column enzhequipment_info.enzhequipment_remerk
	 * 
	 * @mbggenerated Wed May 21 13:51:45 CST 2014
	 */
	private String enzhequipmentRemerk;

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column enzhequipment_info.enzhequipment_id
	 * 
	 * @return the value of enzhequipment_info.enzhequipment_id
	 * 
	 * @mbggenerated Wed May 21 13:51:45 CST 2014
	 */
	public Integer getEnzhequipmentId() {
		return enzhequipmentId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column enzhequipment_info.enzhequipment_id
	 * 
	 * @param enzhequipmentId
	 *            the value for enzhequipment_info.enzhequipment_id
	 * 
	 * @mbggenerated Wed May 21 13:51:45 CST 2014
	 */
	public void setEnzhequipmentId(Integer enzhequipmentId) {
		this.enzhequipmentId = enzhequipmentId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column enzhequipment_info.user_id
	 * 
	 * @return the value of enzhequipment_info.user_id
	 * 
	 * @mbggenerated Wed May 21 13:51:45 CST 2014
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column enzhequipment_info.user_id
	 * 
	 * @param userId
	 *            the value for enzhequipment_info.user_id
	 * 
	 * @mbggenerated Wed May 21 13:51:45 CST 2014
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column enzhequipment_info.meetingroom_id
	 * 
	 * @return the value of enzhequipment_info.meetingroom_id
	 * 
	 * @mbggenerated Wed May 21 13:51:45 CST 2014
	 */
	public Integer getMeetingroomId() {
		return meetingroomId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column enzhequipment_info.meetingroom_id
	 * 
	 * @param meetingroomId
	 *            the value for enzhequipment_info.meetingroom_id
	 * 
	 * @mbggenerated Wed May 21 13:51:45 CST 2014
	 */
	public void setMeetingroomId(Integer meetingroomId) {
		this.meetingroomId = meetingroomId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column enzhequipment_info.enzhequipment_name
	 * 
	 * @return the value of enzhequipment_info.enzhequipment_name
	 * 
	 * @mbggenerated Wed May 21 13:51:45 CST 2014
	 */
	public String getEnzhequipmentName() {
		return enzhequipmentName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column enzhequipment_info.enzhequipment_name
	 * 
	 * @param enzhequipmentName
	 *            the value for enzhequipment_info.enzhequipment_name
	 * 
	 * @mbggenerated Wed May 21 13:51:45 CST 2014
	 */
	public void setEnzhequipmentName(String enzhequipmentName) {
		this.enzhequipmentName = enzhequipmentName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column enzhequipment_info.procurement_time
	 * 
	 * @return the value of enzhequipment_info.procurement_time
	 * 
	 * @mbggenerated Wed May 21 13:51:45 CST 2014
	 */
	public Date getProcurementTime() {
		return procurementTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column enzhequipment_info.procurement_time
	 * 
	 * @param procurementTime
	 *            the value for enzhequipment_info.procurement_time
	 * 
	 * @mbggenerated Wed May 21 13:51:45 CST 2014
	 */
	public void setProcurementTime(Date procurementTime) {
		this.procurementTime = procurementTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column enzhequipment_info.enzhequipment_price
	 * 
	 * @return the value of enzhequipment_info.enzhequipment_price
	 * 
	 * @mbggenerated Wed May 21 13:51:45 CST 2014
	 */
	public Double getEnzhequipmentPrice() {
		return enzhequipmentPrice;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column enzhequipment_info.enzhequipment_price
	 * 
	 * @param enzhequipmentPrice
	 *            the value for enzhequipment_info.enzhequipment_price
	 * 
	 * @mbggenerated Wed May 21 13:51:45 CST 2014
	 */
	public void setEnzhequipmentPrice(Double enzhequipmentPrice) {
		this.enzhequipmentPrice = enzhequipmentPrice;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column enzhequipment_info.enzhequipment_remerk
	 * 
	 * @return the value of enzhequipment_info.enzhequipment_remerk
	 * 
	 * @mbggenerated Wed May 21 13:51:45 CST 2014
	 */
	public String getEnzhequipmentRemerk() {
		return enzhequipmentRemerk;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column enzhequipment_info.enzhequipment_remerk
	 * 
	 * @param enzhequipmentRemerk
	 *            the value for enzhequipment_info.enzhequipment_remerk
	 * 
	 * @mbggenerated Wed May 21 13:51:45 CST 2014
	 */
	public void setEnzhequipmentRemerk(String enzhequipmentRemerk) {
		this.enzhequipmentRemerk = enzhequipmentRemerk;
	}
	
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getMeetingroomName() {
		return meetingroomName;
	}

	public void setMeetingroomName(String meetingroomName) {
		this.meetingroomName = meetingroomName;
	}

	@Override
	public String toString() {
		return "EnzhequipmentInfo [userName=" + userName + ", meetingroomName="
				+ meetingroomName + ", enzhequipmentId=" + enzhequipmentId
				+ ", userId=" + userId + ", meetingroomId=" + meetingroomId
				+ ", enzhequipmentName=" + enzhequipmentName
				+ ", procurementTime=" + procurementTime
				+ ", enzhequipmentPrice=" + enzhequipmentPrice
				+ ", enzhequipmentRemerk=" + enzhequipmentRemerk + "]";
	}




}