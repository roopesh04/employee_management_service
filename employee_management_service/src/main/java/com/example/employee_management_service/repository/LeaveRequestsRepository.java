package com.example.employee_management_service.repository;

import com.example.employee_management_service.models.LeaveRequest;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface LeaveRequestsRepository  extends MongoRepository<LeaveRequest,String> {

    public List<LeaveRequest> findManyByEmpId(String empId);

    public List<LeaveRequest> findManyByManagerId(String managerId);

}
