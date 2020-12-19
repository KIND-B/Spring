package com.projectTest.example.projectTest.repository.Staff;

import com.projectTest.example.projectTest.entity.Staff.StaffRegistration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StaffClassRepository extends JpaRepository<StaffRegistration, Long> {


}
