package com.vico.clever.cdr.service.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "OrderStatus")
public class OrderStatusInfo {

	private String patientID;// 病人号(*)
	private String visitID;// 就诊号(*)
	private String orderID;// 医嘱申请号
	private String orderItem;// 医嘱内容
	private String curStateCode;// 标准状态代码
	private String curStateName;// 标准状态
	private String careflowStepCode;// 实际状态代码
	private String careflowStepName;// 实际状态
	private Date performDateTime;// 执行时间
	private String performDeptCode;// 执行科室代码
	private String performDeptName;// 执行科室名称
	private String performDoctorCode;// 执行人员代码
	private String performDoctorName;// 执行人员名称
	private String personTypeCode;// 人员种类,0-医生 1-护士
	private String personTypeName;// 人员种类,0-医生 1-护士
	private String memo;// 备注

	public OrderStatusInfo() {
		super();
	}

	public OrderStatusInfo(String patientID, String visitID, String orderID,
			String orderItem, String curStateCode, String curStateName,
			String careflowStepCode, String careflowStepName,
			Date performDateTime, String performDeptCode,
			String performDeptName, String performDoctorCode,
			String performDoctorName, String personTypeCode,
			String personTypeName, String memo) {
		super();
		this.patientID = patientID;
		this.visitID = visitID;
		this.orderID = orderID;
		this.orderItem = orderItem;
		this.curStateCode = curStateCode;
		this.curStateName = curStateName;
		this.careflowStepCode = careflowStepCode;
		this.careflowStepName = careflowStepName;
		this.performDateTime = performDateTime;
		this.performDeptCode = performDeptCode;
		this.performDeptName = performDeptName;
		this.performDoctorCode = performDoctorCode;
		this.performDoctorName = performDoctorName;
		this.personTypeCode = personTypeCode;
		this.personTypeName = personTypeName;
		this.memo = memo;
	}

	public String getPatientID() {
		return patientID;
	}

	public void setPatientID(String patientID) {
		this.patientID = patientID;
	}

	public String getVisitID() {
		return visitID;
	}

	public void setVisitID(String visitID) {
		this.visitID = visitID;
	}

	public String getOrderID() {
		return orderID;
	}

	public void setOrderID(String orderID) {
		this.orderID = orderID;
	}

	public String getOrderItem() {
		return orderItem;
	}

	public void setOrderItem(String orderItem) {
		this.orderItem = orderItem;
	}

	public String getCurStateCode() {
		return curStateCode;
	}

	public void setCurStateCode(String curStateCode) {
		this.curStateCode = curStateCode;
	}

	public String getCurStateName() {
		return curStateName;
	}

	public void setCurStateName(String curStateName) {
		this.curStateName = curStateName;
	}

	public String getCareflowStepCode() {
		return careflowStepCode;
	}

	public void setCareflowStepCode(String careflowStepCode) {
		this.careflowStepCode = careflowStepCode;
	}

	public String getCareflowStepName() {
		return careflowStepName;
	}

	public void setCareflowStepName(String careflowStepName) {
		this.careflowStepName = careflowStepName;
	}

	public Date getPerformDateTime() {
		return performDateTime;
	}

	public void setPerformDateTime(Date performDateTime) {
		this.performDateTime = performDateTime;
	}

	public String getPerformDeptCode() {
		return performDeptCode;
	}

	public void setPerformDeptCode(String performDeptCode) {
		this.performDeptCode = performDeptCode;
	}

	public String getPerformDeptName() {
		return performDeptName;
	}

	public void setPerformDeptName(String performDeptName) {
		this.performDeptName = performDeptName;
	}

	public String getPerformDoctorCode() {
		return performDoctorCode;
	}

	public void setPerformDoctorCode(String performDoctorCode) {
		this.performDoctorCode = performDoctorCode;
	}

	public String getPerformDoctorName() {
		return performDoctorName;
	}

	public void setPerformDoctorName(String performDoctorName) {
		this.performDoctorName = performDoctorName;
	}

	public String getPersonTypeCode() {
		return personTypeCode;
	}

	public void setPersonTypeCode(String personTypeCode) {
		this.personTypeCode = personTypeCode;
	}

	public String getPersonTypeName() {
		return personTypeName;
	}

	public void setPersonTypeName(String personTypeName) {
		this.personTypeName = personTypeName;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime
				* result
				+ ((careflowStepCode == null) ? 0 : careflowStepCode.hashCode());
		result = prime
				* result
				+ ((careflowStepName == null) ? 0 : careflowStepName.hashCode());
		result = prime * result
				+ ((curStateCode == null) ? 0 : curStateCode.hashCode());
		result = prime * result
				+ ((curStateName == null) ? 0 : curStateName.hashCode());
		result = prime * result + ((memo == null) ? 0 : memo.hashCode());
		result = prime * result + ((orderID == null) ? 0 : orderID.hashCode());
		result = prime * result
				+ ((orderItem == null) ? 0 : orderItem.hashCode());
		result = prime * result
				+ ((patientID == null) ? 0 : patientID.hashCode());
		result = prime * result
				+ ((performDateTime == null) ? 0 : performDateTime.hashCode());
		result = prime * result
				+ ((performDeptCode == null) ? 0 : performDeptCode.hashCode());
		result = prime * result
				+ ((performDeptName == null) ? 0 : performDeptName.hashCode());
		result = prime
				* result
				+ ((performDoctorCode == null) ? 0 : performDoctorCode
						.hashCode());
		result = prime
				* result
				+ ((performDoctorName == null) ? 0 : performDoctorName
						.hashCode());
		result = prime * result
				+ ((personTypeCode == null) ? 0 : personTypeCode.hashCode());
		result = prime * result
				+ ((personTypeName == null) ? 0 : personTypeName.hashCode());
		result = prime * result + ((visitID == null) ? 0 : visitID.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OrderStatusInfo other = (OrderStatusInfo) obj;
		if (careflowStepCode == null) {
			if (other.careflowStepCode != null)
				return false;
		} else if (!careflowStepCode.equals(other.careflowStepCode))
			return false;
		if (careflowStepName == null) {
			if (other.careflowStepName != null)
				return false;
		} else if (!careflowStepName.equals(other.careflowStepName))
			return false;
		if (curStateCode == null) {
			if (other.curStateCode != null)
				return false;
		} else if (!curStateCode.equals(other.curStateCode))
			return false;
		if (curStateName == null) {
			if (other.curStateName != null)
				return false;
		} else if (!curStateName.equals(other.curStateName))
			return false;
		if (memo == null) {
			if (other.memo != null)
				return false;
		} else if (!memo.equals(other.memo))
			return false;
		if (orderID == null) {
			if (other.orderID != null)
				return false;
		} else if (!orderID.equals(other.orderID))
			return false;
		if (orderItem == null) {
			if (other.orderItem != null)
				return false;
		} else if (!orderItem.equals(other.orderItem))
			return false;
		if (patientID == null) {
			if (other.patientID != null)
				return false;
		} else if (!patientID.equals(other.patientID))
			return false;
		if (performDateTime == null) {
			if (other.performDateTime != null)
				return false;
		} else if (!performDateTime.equals(other.performDateTime))
			return false;
		if (performDeptCode == null) {
			if (other.performDeptCode != null)
				return false;
		} else if (!performDeptCode.equals(other.performDeptCode))
			return false;
		if (performDeptName == null) {
			if (other.performDeptName != null)
				return false;
		} else if (!performDeptName.equals(other.performDeptName))
			return false;
		if (performDoctorCode == null) {
			if (other.performDoctorCode != null)
				return false;
		} else if (!performDoctorCode.equals(other.performDoctorCode))
			return false;
		if (performDoctorName == null) {
			if (other.performDoctorName != null)
				return false;
		} else if (!performDoctorName.equals(other.performDoctorName))
			return false;
		if (personTypeCode == null) {
			if (other.personTypeCode != null)
				return false;
		} else if (!personTypeCode.equals(other.personTypeCode))
			return false;
		if (personTypeName == null) {
			if (other.personTypeName != null)
				return false;
		} else if (!personTypeName.equals(other.personTypeName))
			return false;
		if (visitID == null) {
			if (other.visitID != null)
				return false;
		} else if (!visitID.equals(other.visitID))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "OrderStatusInfo [patientID=" + patientID + ", visitID="
				+ visitID + ", orderID=" + orderID + ", orderItem=" + orderItem
				+ ", curStateCode=" + curStateCode + ", curStateName="
				+ curStateName + ", careflowStepCode=" + careflowStepCode
				+ ", careflowStepName=" + careflowStepName
				+ ", performDateTime=" + performDateTime + ", performDeptCode="
				+ performDeptCode + ", performDeptName=" + performDeptName
				+ ", performDoctorCode=" + performDoctorCode
				+ ", performDoctorName=" + performDoctorName
				+ ", personTypeCode=" + personTypeCode + ", personTypeName="
				+ personTypeName + ", memo=" + memo + "]";
	}

}
