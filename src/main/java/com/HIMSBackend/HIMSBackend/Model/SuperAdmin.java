package com.HIMSBackend.HIMSBackend.Model;

import com.HIMSBackend.HIMSBackend.Enum.RoleType;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;


@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@DiscriminatorValue("SuperAdmin")
public class SuperAdmin extends Common {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "super_admin", cascade = CascadeType.ALL)
    List<Admin> adminList;
//    @Column(name = "email")
//    private String email;
//
//    @Column(name = "phone_number")
//    private String phone_number;
//
//    @Enumerated(EnumType.STRING)
//    @Column(name = "role")
//    private RoleType role
}
