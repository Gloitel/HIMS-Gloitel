package com.HIMSBackend.HIMSBackend.Model;

import com.HIMSBackend.HIMSBackend.Enum.RoleType;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Employee extends Common{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

//    @Column(name = "email")
//    private String email;
//
//    @Column(name = "phone_number")
//    private String phoneNumber;
//
//    @Enumerated(EnumType.STRING)
//    @Column(name = "role")
//    private RoleType role;

    @Column(name = "role_type")
    private String roleType;

    @Column(name = "department")
    private String department;

    @Column(name = "designation")
    private String designation;

    // Getters and setters
}
