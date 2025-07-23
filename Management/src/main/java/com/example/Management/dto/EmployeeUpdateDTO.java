package com.example.Management.dto;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class EmployeeUpdateDTO {
     String fullName;
     String email;
     String password;
     String phone;
     LocalDate birthDate;
     String address;
     String position;
     Boolean active;
}