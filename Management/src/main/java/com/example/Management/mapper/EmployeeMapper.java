package com.example.Management.mapper;

import com.example.Management.dto.EmployeeDTO;
import com.example.Management.entity.Employee;
import org.mapstruct.*;

@Mapper(componentModel = "spring")
public interface EmployeeMapper {

    EmployeeDTO toDto(Employee employee);

    Employee toEntity(EmployeeDTO dto);
}