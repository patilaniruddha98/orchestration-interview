package com.axis.octate.interview.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "interviews")
public class Interview {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id")
	private String id;
	
	@Column(name = "hr_id")
	private String hrId;
	
	
	@Column(name = "hr_name")
	private String hrname;
	
	
	@Column(name = "hr_email")
	private String hrEmail;
	
	
	@Column(name ="candidate_name")
	private String candidateName;
	
	@Column(name="candidate_email")
	private String candidateEmail;
	
	@Column(name = "mobile")
	private String mobile;
	
	@Column(name = "applied_position")
	private String appliedPosition;
	
	@Column(name ="interview_date")
	private Date interviewDate;
	
	@Column(name = "manager_id")
	private String managerId;
	
	

	public Interview(String id, String hrId, String hrname, String hrEmail, String candidateName,String candidateEmail, String mobile,
			String appliedPosition, Date interviewDate, String managerId, String confirmation, String message) {
		super();
		this.id = id;
		this.hrId = hrId;
		this.hrname = hrname;
		this.hrEmail = hrEmail;
		this.candidateName = candidateName;
		this.candidateEmail=candidateEmail;
		this.mobile = mobile;
		this.appliedPosition = appliedPosition;
		this.interviewDate = interviewDate;
		this.managerId = managerId;
		this.confirmation = confirmation;
		this.message = message;
	}

	public String getHrname() {
		return hrname;
	}

	public void setHrname(String hrname) {
		this.hrname = hrname;
	}

	public String getHrEmail() {
		return hrEmail;
	}

	public void setHrEmail(String hrEmail) {
		this.hrEmail = hrEmail;
	}

	public Interview(String id, String confirmation, String message) {
		super();
		this.id = id;
		this.confirmation = confirmation;
		this.message = message;
	}

	public Interview(String confirmation, String message) {
		super();
		this.confirmation = confirmation;
		this.message = message;
	}

	@Column(name = "confirmation")
	private String confirmation;
	
	@Column(name = "message")
	private String message;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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
	

	public String getCandidateEmail() {
		return candidateEmail;
	}

	public void setCandidateEmail(String candidateEmail) {
		this.candidateEmail = candidateEmail;
	}

	public Interview(String hrId, String candidateName,String candidateEmail, String mobile, String appliedPosition, Date interviewDate,
			String managerId, String confirmation, String message) {
		super();
		this.hrId = hrId;
		this.candidateName = candidateName;
		this.candidateEmail=candidateEmail;
		this.mobile = mobile;
		this.appliedPosition = appliedPosition;
		this.interviewDate = interviewDate;
		this.managerId = managerId;
		this.confirmation = confirmation;
		this.message = message;
	}

	public Interview() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Interview(String hrId,String hrName,String hrEmail, String candidateName,String candidateEmail, String mobile, String appliedPosition, Date interviewDate,
			String managerId) {
		super();
		this.hrId = hrId;
		this.hrname=hrName;
		this.hrEmail=hrEmail;
		this.candidateName = candidateName;
		this.candidateEmail=candidateEmail;
		this.mobile = mobile;
		this.appliedPosition = appliedPosition;
		this.interviewDate = interviewDate;
		this.managerId = managerId;
	}
	
	
	
	

}
