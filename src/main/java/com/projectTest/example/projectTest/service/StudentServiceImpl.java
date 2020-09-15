package com.projectTest.example.projectTest.service;

import com.projectTest.example.projectTest.dto.request.StudentRequest;
import com.projectTest.example.projectTest.dto.request.studentUpdateRequest;
import com.projectTest.example.projectTest.dto.response.StudentDeleteResponse;
import com.projectTest.example.projectTest.dto.response.studentUpdateResponse;
import com.projectTest.example.projectTest.entity.StudentsEntity;
import com.projectTest.example.projectTest.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
    public studentUpdateResponse update(studentUpdateRequest studentUpdateRequest, Long id) {

        StudentsEntity studentReq = this.studentRepository.getOne(id);
        studentReq.setAddress(studentUpdateRequest.getAddress());
        studentReq.setFirst_name(studentUpdateRequest.getFirst_name());
        studentReq.setContact(studentUpdateRequest.getContact());
        studentReq.setSt_class(studentUpdateRequest.getSt_class());
        studentReq.setSt_grade(studentUpdateRequest.getSt_grade());
        studentReq.setLast_name(studentUpdateRequest.getLast_name());
        StudentsEntity update =  studentRepository.save(studentReq);


         return convert(update);
    }

    //SAVE
    private StudentsEntity convert(StudentRequest studentRequest) {
        StudentsEntity student = new StudentsEntity();
        student.setId(studentRequest.getId());
        student.setFirst_name(studentRequest.getFirst_name());
        student.setContact(studentRequest.getContact());
        student.setAddress(studentRequest.getAddress());
        student.setSt_class(studentRequest.getSt_class());
        student.setSt_grade(studentRequest.getSt_grade());
        student.setLast_name(studentRequest.getLast_name());


        return student;
    }

    /**
     * UPDATE
     */
    private StudentsEntity convert(studentUpdateRequest studentUpdateRequest) {
        StudentsEntity student = new StudentsEntity();
        student.setId(studentUpdateRequest.getId());
        student.setFirst_name(studentUpdateRequest.getFirst_name());
        student.setContact(studentUpdateRequest.getContact());
        student.setAddress(studentUpdateRequest.getAddress());
        student.setSt_class(studentUpdateRequest.getSt_class());
        student.setSt_grade(studentUpdateRequest.getSt_grade());
        student.setLast_name(studentUpdateRequest.getLast_name());

//        bankBranch.setIsDeleted(0);

        return student;
    }

    private studentUpdateResponse convert(StudentsEntity studentsEntity){

        studentUpdateResponse stuUpdate = new studentUpdateResponse();

//        stuUpdate.se
        stuUpdate.setId(studentsEntity.getId());
        stuUpdate.setFirst_name(studentsEntity.getFirst_name());
        stuUpdate.setContact(studentsEntity.getContact());
        stuUpdate.setAddress(studentsEntity.getAddress());
        stuUpdate.setSt_class(studentsEntity.getSt_class());
        stuUpdate.setSt_grade(studentsEntity.getSt_grade());
        stuUpdate.setLast_name(studentsEntity.getLast_name());
        System.out.println("printed id" + studentsEntity.getId());
//        bankBranch.setIsDeleted(0);

        return stuUpdate;
    }

//delete
    @Override
    public StudentDeleteResponse delete(Long id) {
        studentRepository.deleteById(id);
        StudentDeleteResponse std = new StudentDeleteResponse();

        std.setId(id);
        return std;



    }


}
