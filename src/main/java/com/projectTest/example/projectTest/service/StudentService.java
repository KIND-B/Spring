package com.projectTest.example.projectTest.service;

import com.projectTest.example.projectTest.dto.request.StudentRequest;
import com.projectTest.example.projectTest.dto.request.studentUpdateRequest;
import com.projectTest.example.projectTest.dto.response.StudentDeleteResponse;
import com.projectTest.example.projectTest.dto.response.studentUpdateResponse;
import com.projectTest.example.projectTest.entity.StudentsEntity;
import org.springframework.stereotype.Service;

@Service
public interface StudentService {

    StudentsEntity save(StudentRequest studentRequest);

    studentUpdateResponse update(studentUpdateRequest studentUpdateRequest, Long id);

    StudentDeleteResponse delete(Long id);
}
