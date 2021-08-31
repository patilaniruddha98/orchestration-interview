package com.axis.octate.service;

import java.util.List;
import java.util.Optional;

import com.axis.octate.interview.model.Interview;
import com.axis.octate.request.CompleteInterview;
import com.axis.octate.request.ConfirmationRequest;
import com.axis.octate.request.ScheduleInterviewRequest;

public interface InterviewService {
	
	public String scheduleInterview(ScheduleInterviewRequest interviewRequest);
	
	public String ConfirmInterview(String id,ConfirmationRequest confirmationRequest);
	
	public List<Interview> findByManagerId(String managerId);
	
	public Optional<Interview> findInterviewRequestById(String id);
	
	public List<CompleteInterview> getall();

}
