package com.axis.octate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.axis.octate.constant.PermissionURLConstants;
import com.axis.octate.interview.model.Interview;
import com.axis.octate.request.CompleteInterview;
import com.axis.octate.service.InterviewServiceImpl;

@RestController
@RequestMapping("/api/interview")
@CrossOrigin(origins = "*", maxAge = 3600)
public class InterviewController {
	
	@Autowired
	InterviewServiceImpl interviewService;
	
	@GetMapping("/getall")
	@PreAuthorize("hasPermission('" + PermissionURLConstants.INTERVIEW_API_SERVICE + "','" + PermissionURLConstants.VIEW + "')")
	public List<CompleteInterview> getallInterviews(){
		return interviewService.getall();
	}

}
