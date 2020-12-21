package com.projectTest.example.projectTest.service;

import com.projectTest.example.projectTest.dto.request.StudentClassSaveRequest;
import com.projectTest.example.projectTest.dto.request.StudentGradeSaveRequest;
import com.projectTest.example.projectTest.dto.request.StudentRequest;
import com.projectTest.example.projectTest.dto.request.studentUpdateRequest;
import com.projectTest.example.projectTest.dto.response.StudentClassDeleteResponse;
import com.projectTest.example.projectTest.dto.response.StudentDeleteResponse;
import com.projectTest.example.projectTest.dto.response.StudentGradeDeleteResponse;
import com.projectTest.example.projectTest.dto.response.studentUpdateResponse;
import com.projectTest.example.projectTest.entity.StudentClassEntity;
import com.projectTest.example.projectTest.entity.StudentGradeEntity;
import com.projectTest.example.projectTest.entity.StudentsEntity;
import org.springframework.stereotype.Service;

@Service
public interface StudentService {

    StudentsEntity save(StudentRequest studentRequest);

    StudentGradeEntity saveGrade(StudentGradeSaveRequest studentGradeSaveRequest);

    StudentClassEntity saveClass(StudentClassSaveRequest studentClassSaveRequest);

    studentUpdateResponse update(studentUpdateRequest studentUpdateRequest, Long id);

    StudentDeleteResponse delete(Long id);

    StudentGradeDeleteResponse deleteGrade(Long id);

    StudentClassDeleteResponse deleteClass(Long id);
}
