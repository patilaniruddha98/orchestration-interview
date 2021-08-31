package com.axis.octate.request;

import java.util.Date;

import javax.persistence.Column;

public class ScheduleInterviewRequest {
	
	
	private String hrId;
	
	private String hrName;
	
	private String hrEmail;
	

	
	private String candidateName;
	
	private String candidateEmail;
	
	
	private String mobile;
	
	
	private String appliedPosition;
	

	private Date interviewDate;
	
	
	private String managerId;
	
	private String confirmation;
	
	private String message;


	



	

	public ScheduleInterviewRequest(String hrId, String hrName, String hrEmail, String candidateName,
			String candidateEmail, String mobile, String appliedPosition, Date interviewDate, String managerId,
			String confirmation, String message) {
		super();
		this.hrId = hrId;
		this.hrName = hrName;
		this.hrEmail = hrEmail;
		this.candidateName = candidateName;
		this.candidateEmail = candidateEmail;
		this.mobile = mobile;
		this.appliedPosition = appliedPosition;
		this.interviewDate = interviewDate;
		this.managerId = managerId;
		this.confirmation = confirmation;
		this.message = message;
	}



	public String getCandidateEmail() {
		return candidateEmail;
	}



	public void setCandidateEmail(String candidateEmail) {
		this.candidateEmail = candidateEmail;
	}



	public String getHrName() {
		return hrName;
	}



	public void setHrName(String hrName) {
		this.hrName = hrName;
	}



	public String getHrEmail() {
		return hrEmail;
	}



	public void setHrEmail(String hrEmail) {
		this.hrEmail = hrEmail;
	}



	public String getConfirmation() {
		return confirmation;
	}


	public void setConfirmation(String confirmation) {
		this.confirmation = confirmation;
	}


	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}


	public String getHrId() {
		return hrId;
	}


	public void setHrId(String hrId) {
		this.hrId = hrId;
	}


	public String getCandidateName() {
		return candidateName;
	}


	public void setCandidateName(String candidateName) {
		this.candidateName = candidateName;
	}


	public String getMobile() {
		return mobile;
	}


	public void setMobile(String mobile) {
		this.mobile = mobile;
	}


	public String getAppliedPosition() {
		return appliedPosition;
	}


	public void setAppliedPosition(String appliedPosition) {
		this.appliedPosition = appliedPosition;
	}


	public Date getInterviewDate() {
		return interviewDate;
	}


	public void setInterviewDate(Date interviewDate) {
		this.interviewDate = interviewDate;
	}


	public String getManagerId() {
		return managerId;
	}


	public void setManagerId(String managerId) {
		this.managerId = managerId;
	}


	public ScheduleInterviewRequest(String hrId,String hrName,String hrEmail, String candidateName,String candidateEmail, String mobile, String appliedPosition,
			Date interviewDate, String managerId) {
		super();
		this.hrId = hrId;
		this.hrName=hrName;
		this.hrEmail=hrEmail;
		this.candidateName = candidateName;
		this.candidateEmail=candidateEmail;
		this.mobile = mobile;
		this.appliedPosition = appliedPosition;
		this.interviewDate = interviewDate;
		this.managerId = managerId;
	}


	public ScheduleInterviewRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
