package com.projectTest.example.projectTest.service;

import com.projectTest.example.projectTest.dto.request.StudentRequest;
import com.projectTest.example.projectTest.dto.request.studentUpdateRequest;
import com.projectTest.example.projectTest.dto.response.studentUpdateResponse;
import com.projectTest.example.projectTest.entity.StudentsEntity;
import com.projectTest.example.projectTest.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    StudentRepository studentRepository;
    @Override
    public StudentsEntity save(StudentRequest studentRequest) {

        StudentsEntity save = studentRepository.save(convert(studentRequest));

//        System.out.println("--------- save method ----------");

        return save;
    }

    @Override
    public studentUpdateResponse update(studentUpdateRequest studentUpdateRequest) {
        StudentsEntity studentReq = this.studentRepository.getOne(studentUpdateRequest.getId());
        StudentsEntity update =  studentRepository.save(convert(studentUpdateRequest));
      return convert(update);
    }

    //SAVE
    private StudentsEntity convert(StudentRequest studentRequest) {
        StudentsEntity student = new StudentsEntity();
        student.setId(studentRequest.getId());
        student.setName(studentRequest.getName());
        student.setContact(studentRequest.getContact());
        student.setAddress(studentRequest.getAddress());


        return student;
    }

    /**
     * UPDATE
     */
    private StudentsEntity convert(studentUpdateRequest studentUpdateRequest) {
        StudentsEntity student = new StudentsEntity();
        student.setId(studentUpdateRequest.getId());
        student.setName(studentUpdateRequest.getName());
        student.setContact(studentUpdateRequest.getContact());
        student.setAddress(studentUpdateRequest.getAddress());
//        bankBranch.setIsDeleted(0);

        return student;
    }

    private studentUpdateResponse convert(StudentsEntity studentsEntity){

        studentUpdateResponse stuUpdate = new studentUpdateResponse();

//        stuUpdate.se
        stuUpdate.setId(studentsEntity.getId());
        stuUpdate.setName(studentsEntity.getName());
        stuUpdate.setContact(studentsEntity.getContact());
        stuUpdate.setAddress(studentsEntity.getAddress());
//        bankBranch.setIsDeleted(0);

        return stuUpdate;
    }
}
