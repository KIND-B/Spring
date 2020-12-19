package com.projectTest.example.projectTest.service.Staff;

import com.projectTest.example.projectTest.dto.request.Staff.StaffClassSaveRequest;
import com.projectTest.example.projectTest.entity.Staff.StaffRegistration;
import org.springframework.stereotype.Service;

@Service
public interface StaffService {

    StaffRegistration saveStaff(StaffClassSaveRequest staffClassSaveRequest);

}
