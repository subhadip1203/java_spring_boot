package com.subhadip.pahari.spring1.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.subhadip.pahari.spring1.entity.DepartmentEntity;
import com.subhadip.pahari.spring1.service.DepartmentService;


@RestController
public class DepartmentController {
    
    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/department")
    public DepartmentEntity saveDepartment(@RequestBody DepartmentEntity department) {
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/department")
    public List<DepartmentEntity> getDepartmentList() {
        return departmentService.getDepartmentList();
    }

    @GetMapping("/department/{id}")
    public Optional<DepartmentEntity> getDepartmentbyId(@PathVariable("id") Long departmentId) {
        return departmentService.getDepartmentbyId(departmentId);
    }
}
