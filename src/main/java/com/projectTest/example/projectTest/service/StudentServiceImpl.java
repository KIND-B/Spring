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
import com.projectTest.example.projectTest.repository.StudentClassRepository;
import com.projectTest.example.projectTest.repository.StudentGradeRepository;
import com.projectTest.example.projectTest.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private StudentGradeRepository studentGradeRepository;
    @Autowired
    private StudentClassRepository studentClassRepository;

    @Override
    public StudentsEntity save(StudentRequest studentRequest) {

        StudentsEntity save = studentRepository.save(convert(studentRequest));



        System.out.println("--------- save method ----------" + save);

        return save;
    }

    @Override
    public StudentGradeEntity saveGrade(StudentGradeSaveRequest studentGradeSaveRequest) {

         StudentGradeEntity grades = studentGradeRepository.save(convert(studentGradeSaveRequest));

       return grades;
    }

    @Override
    public StudentClassEntity saveClass(StudentClassSaveRequest studentClassSaveRequest) {

        StudentClassEntity classes = studentClassRepository.save(convert(studentClassSaveRequest));
        return classes;
    }

    private StudentClassEntity convert(StudentClassSaveRequest studentClassSaveRequest) {

        StudentClassEntity stclss = new StudentClassEntity();
        stclss.setId(studentClassSaveRequest.getId());
        stclss.setClass_name(studentClassSaveRequest.getClass_name());

        return stclss;
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
        System.out.println(student);

        return student;
    }

    //saveGrade
    private StudentGradeEntity convert(StudentGradeSaveRequest studentGradeSaveRequest){
        StudentGradeEntity grade = new StudentGradeEntity();
        grade.setId(studentGradeSaveRequest.getId());
        grade.setGrade_name(studentGradeSaveRequest.getGrade_name());
        return grade;
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

    @Override
    public StudentGradeDeleteResponse deleteGrade(Long id) {

        studentGradeRepository.deleteById(id);

        StudentGradeDeleteResponse stGrdDel = new StudentGradeDeleteResponse();

        stGrdDel.setId(id);
        System.out.println("fuck2" + stGrdDel);
        return stGrdDel;

    }

    @Override
    public StudentClassDeleteResponse deleteClass(Long id) {
        studentClassRepository.deleteById(id);

        StudentClassDeleteResponse stClassDelete = new StudentClassDeleteResponse();

       stClassDelete.setId(id);
       return  stClassDelete;
    }


}
