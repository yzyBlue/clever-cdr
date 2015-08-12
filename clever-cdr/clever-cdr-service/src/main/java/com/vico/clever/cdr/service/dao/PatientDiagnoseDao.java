package com.vico.clever.cdr.service.dao;

import org.apache.ibatis.annotations.Param;

import com.vico.clever.cdr.service.model.ProblemDiagnosis;

public interface PatientDiagnoseDao {
	
	public ProblemDiagnosis selectPatientDiagnose(@Param("patientID") String patientID,@Param("visitID") String visitID);
	
	public int deletePatientDiagnose(@Param("patientID") String patientID,@Param("visitID") String visitID);
	
	public int insertPatientDiagnose(ProblemDiagnosis problemDiagnosis);
	
	public int updatePatientDiagnose(ProblemDiagnosis problemDiagnosis);
	
	public int selectPatientDiagCount(@Param("patientID") String patientID,@Param("visitID") String visitID);
}