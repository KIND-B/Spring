package com.projectTest.example.projectTest.controller;

import com.projectTest.example.projectTest.dto.request.StudentClassSaveRequest;
import com.projectTest.example.projectTest.dto.request.StudentGradeSaveRequest;
import com.projectTest.example.projectTest.dto.request.StudentRequest;
import com.projectTest.example.projectTest.dto.request.studentUpdateRequest;
import com.projectTest.example.projectTest.dto.response.*;
import com.projectTest.example.projectTest.entity.StudentClassEntity;
import com.projectTest.example.projectTest.entity.StudentGradeEntity;
import com.projectTest.example.projectTest.entity.StudentsEntity;
import com.projectTest.example.projectTest.repository.StudentClassRepository;
import com.projectTest.example.projectTest.repository.StudentGradeRepository;
import com.projectTest.example.projectTest.repository.StudentRepository;
import com.projectTest.example.projectTest.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
//import javax.validation.Valid;
import java.util.List;

@RequestMapping("Student")
@RestController
@CrossOrigin
public class StudentController {

    @Autowired
    StudentService studentService;

    @Autowired
    StudentRepository studentRepository;

    @Autowired
    StudentGradeRepository studentGradeRepository;

    @Autowired
    StudentClassRepository studentClassRepository;

    //postmapping methods
    @PostMapping("student")
    public void add(@RequestBody StudentRequest request) {

        studentService.save(request);
    }
    @PostMapping("grade")
    public void save(@RequestBody StudentGradeSaveRequest request){

        studentService.saveGrade(request);

    }

    @PostMapping("class")
    public void  saveClass(@RequestBody StudentClassSaveRequest strequest){

        studentService.saveClass(strequest);
    }

    //getmapping methods
    @GetMapping("student")
    public List<StudentsEntity> getall()
    {

        return studentRepository.findAll();
    }

    @GetMapping("getAllGrade")
    public List<StudentGradeEntity> getAllGrade(){
        return studentGradeRepository.findAll();
    }

    @GetMapping("getAllClass")
    public List<StudentClassEntity> getAllClass(){
        return studentClassRepository.findAll();
    }

    //updateMethod
    @PutMapping("/student/{id}")
    public  ResponseEntity<studentUpdateResponse> update(@PathVariable("id") long id,@RequestBody studentUpdateRequest updateRequest){


        studentUpdateResponse update = studentService.update(updateRequest, id);
        if(update == null){
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(update);
    }

    //delete method
    @DeleteMapping("{id}")
    public ResponseEntity<StudentDeleteResponse> deleteStudent(@PathVariable("id") Long id){

        StudentDeleteResponse delete = studentService.delete(id);

        if (delete == null) {

            return  ResponseEntity.notFound().build();
        }

            return ResponseEntity.ok(delete);
    }

    @DeleteMapping("/grade/{id}")
    public ResponseEntity<StudentGradeDeleteResponse> deleteGrade(@PathVariable("id") Long id){

         StudentGradeDeleteResponse deleteGrade = studentService.deleteGrade(id);


         if(deleteGrade == null){

             return  ResponseEntity.notFound().build();
         }
        return ResponseEntity.ok(deleteGrade);

    }

    @DeleteMapping("class/{id}")
    public ResponseEntity<StudentClassDeleteResponse> deleteClass(@PathVariable("id") Long id){
        StudentClassDeleteResponse deleteClass = studentService.deleteClass(id);

        if(deleteClass == null){
            return  ResponseEntity.notFound().build();
        }
        return  ResponseEntity.ok(deleteClass);

    }












}
