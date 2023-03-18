package com.subhadip.pahari.spring1.service;

import java.util.List;
import java.util.Optional;

import com.subhadip.pahari.spring1.entity.DepartmentEntity;

public interface DepartmentService {

    public DepartmentEntity saveDepartment(DepartmentEntity department);

    public List<DepartmentEntity> getDepartmentList();

    public Optional <DepartmentEntity> getDepartmentbyId(Long departmentId);
    
}
