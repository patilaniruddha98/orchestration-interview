package com.axis.octate.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.axis.octate.constant.PermissionURLConstants;
import com.axis.octate.interview.model.Interview;
import com.axis.octate.request.ConfirmationRequest;
import com.axis.octate.service.InterviewServiceImpl;

@RestController
@RequestMapping("/api/interview")
@CrossOrigin(origins = "*", maxAge = 3600)
public class InterviewConfirmationController {
	
	@Autowired
	InterviewServiceImpl interviewService;
	
	@GetMapping("/managerverify/{managerId}")
	@PreAuthorize("hasPermission('" + PermissionURLConstants.INTERVIEW_API_SERVICE + "','" + PermissionURLConstants.VIEW + "')")
	public List<Interview> getInterviewRequest(@PathVariable("managerId") String managerId){
		return interviewService.findByManagerId(managerId);
	}
	
	@GetMapping("/getinterviewrequest/{id}")
	@PreAuthorize("hasPermission('" + PermissionURLConstants.INTERVIEW_API_SERVICE + "','" + PermissionURLConstants.VIEW + "')")
	public Optional<Interview> getInterviewRequestById(@PathVariable("id") String id){
		return interviewService.findInterviewRequestById(id);
	}
	
	@PostMapping("/confirmation/{id}")
	@PreAuthorize("hasPermission('" + PermissionURLConstants.INTERVIEW_API_SERVICE + "','" + PermissionURLConstants.ADD + "')")
	public ResponseEntity<String> getInterviewRequest(@PathVariable("id") String id, @RequestBody ConfirmationRequest confirmationRequest){
		return new ResponseEntity<String>(interviewService.ConfirmInterview(id, confirmationRequest),HttpStatus.OK);
	}

}
