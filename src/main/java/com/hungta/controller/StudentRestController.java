package com.hungta.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hungta.dto.StudentResponse;
import com.hungta.entity.Student;
import com.hungta.service.StudentService;

@Controller
@RequestMapping("/students")
public class StudentRestController {

	@Autowired
    private StudentService studentService;
	
	@RequestMapping(value = "/x", method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public List<StudentResponse> getAll() {
        System.out.println("come here..!");
        List<StudentResponse> lstResponse = new ArrayList<StudentResponse>();
        List<Student> lstDB = studentService.getAll();
        for(Student st : lstDB) {
            StudentResponse studentResponse = StudentResponse.StudentResponseBuilder.aStudentResponse()
                    .withId(String.valueOf(st.getId()))
                    .withUserName(st.getUserName())
                    .withFirstName(st.getFirstName())
                    .withLastName(st.getLastName())
                    .withEmailAddress(st.getEmailAddress())
                    .withDateOfBirth(st.getDateOfBirth().toString())
                    .build();
            lstResponse.add(studentResponse);
        }
        return lstResponse;
    }
	
}
