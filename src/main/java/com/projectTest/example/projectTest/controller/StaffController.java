package com.projectTest.example.projectTest.controller;

import com.projectTest.example.projectTest.dto.request.Staff.StaffClassSaveRequest;
import com.projectTest.example.projectTest.service.Staff.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("Staff")
@RestController
@CrossOrigin
public class StaffController {

    @Autowired
    StaffService staffService;


    @PostMapping("Staff_add")
    public  void saveStaff(@RequestBody StaffClassSaveRequest staffClassSaveRequest){
       staffService.saveStaff(staffClassSaveRequest);

    }

    @GetMapping("Staff/Get")
    public  void getStaffAll(){

    }

    @GetMapping("Staff/GetById")
    public  void getStaffById(){

    }

    @PutMapping("Staf/UpdateById")
    public void updateStaffById(){

    }

    @DeleteMapping("Delete/id")
    public void deleteById(){

    }
}
