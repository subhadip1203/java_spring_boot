package com.subhadip.pahari.spring1.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.subhadip.pahari.spring1.entity.DepartmentEntity;
import com.subhadip.pahari.spring1.repository.DepartmentRepository;


@Service
// IMPL means => implementationm
public class DepartmentServiceIMPL implements DepartmentService {
    @Autowired
    private DepartmentRepository  departmentRepository;
    
    @Override
    public DepartmentEntity saveDepartment(DepartmentEntity department) {
        return departmentRepository.save(department);
    }

    @Override
    public List<DepartmentEntity> getDepartmentList() {
        return departmentRepository.findAll();
    }

    @Override
    public Optional<DepartmentEntity> getDepartmentbyId(Long departmentId) {
        return departmentRepository.findById(departmentId);
    }

    
    
}
