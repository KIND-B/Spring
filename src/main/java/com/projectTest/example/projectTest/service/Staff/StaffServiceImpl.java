package com.projectTest.example.projectTest.service.Staff;

import com.projectTest.example.projectTest.dto.request.Staff.StaffClassSaveRequest;
import com.projectTest.example.projectTest.entity.Staff.StaffRegistration;
import com.projectTest.example.projectTest.repository.Staff.StaffClassRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StaffServiceImpl implements StaffService {

    @Autowired
    StaffClassRepository staffClassRepository;


    @Override
    public StaffRegistration saveStaff(StaffClassSaveRequest staffClassSaveRequest) {

        StaffRegistration save = staffClassRepository.save(convert(staffClassSaveRequest));

        return  save;
    }

//    convert methods
    private StaffRegistration convert(StaffClassSaveRequest staffClassSaveRequest){

        StaffRegistration staff1 = new StaffRegistration();

        
        staff1.setId(staffClassSaveRequest.getId());
        staff1.setF_name(staffClassSaveRequest.getF_name());
        staff1.setS_name(staffClassSaveRequest.getS_name());
        staff1.setL_name(staffClassSaveRequest.getL_name());
        staff1.setCon_no(staffClassSaveRequest.getCon_no());
        staff1.setAddress_per(staffClassSaveRequest.getAddress_per());
        staff1.setAddress_temp(staffClassSaveRequest.getAddress_temp());
        staff1.setE_mail(staffClassSaveRequest.getE_mail());
        staff1.setD_o_a(staffClassSaveRequest.getD_o_a());
        staff1.setD_o_b(staffClassSaveRequest.getD_o_b());
        staff1.setN_i_c(staffClassSaveRequest.getN_i_c());
        staff1.setPassword(staffClassSaveRequest.getPassword());
        staff1.setCon_password(staffClassSaveRequest.getCon_password());

        return staff1;

    }


}
