package com.axis.octate.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.axis.octate.constant.PermissionURLConstants;
import com.axis.octate.request.ScheduleInterviewRequest;
import com.axis.octate.service.InterviewServiceImpl;

@RestController
@RequestMapping("/api/interview")
@CrossOrigin(origins = "*", maxAge = 3600)
public class InterviewSchedularController {
	@Autowired
	InterviewServiceImpl interviewService;
	
	@PostMapping("/setinterviews")
	@PreAuthorize("hasPermission('" + PermissionURLConstants.INTERVIEW_API_SERVICE + "','" + PermissionURLConstants.ADD + "')")
	public ResponseEntity<String> setInterview(@RequestBody ScheduleInterviewRequest interviewRequest){
		return new ResponseEntity<String>(interviewService.scheduleInterview(interviewRequest),HttpStatus.OK);
	}

}
