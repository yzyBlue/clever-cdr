package com.vico.clever.cdr.service.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "LabTestStatus")
public class LabTestStatus {
	private String patientID;// 病人号(*)
	private String visitID;// 就诊号(*)
	private String testReqID;// 检验申请号
	private String testItemName;// 检验项目名称
	private String curStateCode;// 标准状态代码
	private String curStateName;// 标准状态
	private String careflowStepCode;// 实际状态代码
	private String careflowStepName;// 实际状态
	private Date performDateTime;// 执行时间
	private String performDoctorCode;// 执行人员代码
	private String performDoctorName;// 执行人员名称
	private String memo;// 备注

	public LabTestStatus() {
		super();
	}

	public LabTestStatus(String patientID, String visitID, String testReqID,
			String testItemName, String curStateCode, String curStateName,
			String careflowStepCode, String careflowStepName,
			Date performDateTime, String performDoctorCode,
			String performDoctorName, String memo) {
		super();
		this.patientID = patientID;
		this.visitID = visitID;
		this.testReqID = testReqID;
		this.testItemName = testItemName;
		this.curStateCode = curStateCode;
		this.curStateName = curStateName;
		this.careflowStepCode = careflowStepCode;
		this.careflowStepName = careflowStepName;
		this.performDateTime = performDateTime;
		this.performDoctorCode = performDoctorCode;
		this.performDoctorName = performDoctorName;
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

	public String getTestReqID() {
		return testReqID;
	}

	public void setTestReqID(String testReqID) {
		this.testReqID = testReqID;
	}

	public String getTestItemName() {
		return testItemName;
	}

	public void setTestItemName(String testItemName) {
		this.testItemName = testItemName;
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
		result = prime * result
				+ ((patientID == null) ? 0 : patientID.hashCode());
		result = prime * result
				+ ((performDateTime == null) ? 0 : performDateTime.hashCode());
		result = prime
				* result
				+ ((performDoctorCode == null) ? 0 : performDoctorCode
						.hashCode());
		result = prime
				* result
				+ ((performDoctorName == null) ? 0 : performDoctorName
						.hashCode());
		result = prime * result
				+ ((testItemName == null) ? 0 : testItemName.hashCode());
		result = prime * result
				+ ((testReqID == null) ? 0 : testReqID.hashCode());
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
		LabTestStatus other = (LabTestStatus) obj;
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
		if (testItemName == null) {
			if (other.testItemName != null)
				return false;
		} else if (!testItemName.equals(other.testItemName))
			return false;
		if (testReqID == null) {
			if (other.testReqID != null)
				return false;
		} else if (!testReqID.equals(other.testReqID))
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
		StringBuilder builder = new StringBuilder();
		builder.append("LabTestStatus [patientID=").append(patientID)
				.append(", visitID=").append(visitID).append(", testReqID=")
				.append(testReqID).append(", testItemName=")
				.append(testItemName).append(", curStateCode=")
				.append(curStateCode).append(", curStateName=")
				.append(curStateName).append(", careflowStepCode=")
				.append(careflowStepCode).append(", careflowStepName=")
				.append(careflowStepName).append(", performDateTime=")
				.append(performDateTime).append(", performDoctorCode=")
				.append(performDoctorCode).append(", performDoctorName=")
				.append(performDoctorName).append(", memo=").append(memo)
				.append("]");
		return builder.toString();
	}

}
