package com.axis.octate.service;

import java.sql.ResultSet;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.axis.octate.interview.model.Interview;
import com.axis.octate.repository.InterviewRepository;
import com.axis.octate.request.CompleteInterview;
import com.axis.octate.request.ConfirmationRequest;
import com.axis.octate.request.ScheduleInterviewRequest;

@Service
public class InterviewServiceImpl implements InterviewService {

	@Autowired
	InterviewRepository interviewRepository;
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public String scheduleInterview(ScheduleInterviewRequest interviewRequest) {

	

		Interview setInterview = new Interview(interviewRequest.getHrId(),interviewRequest.getHrName(),interviewRequest.getHrEmail(),
				interviewRequest.getCandidateName(),interviewRequest.getCandidateEmail(),
				interviewRequest.getMobile(), interviewRequest.getAppliedPosition(),
				interviewRequest.getInterviewDate(), interviewRequest.getManagerId()
				
				);
		setInterview.setConfirmation("Pending...");

		interviewRepository.save(setInterview);

		return "Interview is Schedule for " + interviewRequest.getCandidateName();
	}

	@Override
	public String ConfirmInterview(String id, ConfirmationRequest confirmationRequest) {

		Optional<Interview> data = interviewRepository.findById(id);
		if (data.isPresent()) {
			
			

		System.out.println(data.get().getCandidateName()+"****************************");
			
			
			Interview confirm = new Interview(id, data.get().getHrId(),data.get().getHrname(),data.get().getHrEmail()
					, data.get().getCandidateName(),data.get().getCandidateEmail()
					,data.get().getMobile(),
					data.get().getAppliedPosition(), data.get().getInterviewDate(),
					data.get().getManagerId(), confirmationRequest.getConfirmation(), confirmationRequest.getMessage());

			interviewRepository.save(confirm);
		}

		return "updated by manager";
	}

	@Override
	public List<Interview> findByManagerId(String managerId) {

		return interviewRepository.findByManagerId(managerId);

	}

	@Override
	public Optional<Interview> findInterviewRequestById(String id) {
		// TODO Auto-generated method stub
		return interviewRepository.findById(id);
	}

	@Override
	public List<CompleteInterview> getall() {
		
		List<CompleteInterview> list1 =jdbcTemplate.query("select interviews.id,interviews.hr_id,interviews.hr_name,interviews.hr_email,\r\n"
				+ "interviews.candidate_name,interviews.candidate_email,interviews.mobile,\r\n"
				+ "interviews.applied_position,interviews.interview_date,interviews.manager_id,\r\n"
				+ "user.name,user.email_id,interviews.confirmation,interviews.message \r\n"
				+ "from interviews\r\n"
				+ "inner join user on interviews.manager_id = user.id;"
				,  (ResultSet rs, int rowNum) -> {
					CompleteInterview data = new CompleteInterview();
					data.setId(rs.getInt("id"));
					data.setHr_id(rs.getInt("hr_id"));
					data.setHr_name(rs.getString("hr_name"));
					data.setHr_email(rs.getString("hr_email"));
					data.setCandidate_name(rs.getString("candidate_name"));
					data.setCandidate_email(rs.getString("candidate_email"));
					data.setMobile(rs.getString("mobile"));
					data.setApplied_position(rs.getString("applied_position"));
					data.setInterview_date(rs.getDate("interview_date"));
					data.setManager_id(rs.getInt("manager_id"));
					data.setManager_name(rs.getString("name"));
					data.setManager_email(rs.getString("email_id"));
					data.setConfirmation(rs.getString("confirmation"));
					data.setMessage(rs.getString("message"));
					return data;
				});
		
		
		
		return list1;
		
	}

}
