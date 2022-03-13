package com.soap.webservices.demosoap.soap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.in28minutes.courses.CourseDetails;
import com.in28minutes.courses.GetCourseDetailRequest_0020;
import com.in28minutes.courses.GetCourseDetailResponse;
import com.soap.webservices.demosoap.soap.service.CourseDetailsService;

@Endpoint
public class CourseDetailsEndPoint {
	@Autowired
	CourseDetailsService service;
	//method
	//input-GetCourseDetailRequest
	//output GetCourseDetailRwsponse
	@PayloadRoot(namespace="http://in28minutes.com", localPart="GetCourseDetailRequest_0020")
	
	@ResponsePayload
	public GetCourseDetailResponse processCourseDetailsRequest
	(@RequestPayload GetCourseDetailRequest_0020 request)
	{
		GetCourseDetailResponse response=new GetCourseDetailResponse();
		CourseDetails courseDetails = new CourseDetails();
		courseDetails.setId(request.getId());
		courseDetails.setName("Microservices course");
		courseDetails.setDescription("Learning microservices is not easy");
		response.setCourseDetails(courseDetails);
		return response;
	}

}
