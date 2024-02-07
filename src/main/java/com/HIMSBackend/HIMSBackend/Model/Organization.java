package com.HIMSBackend.HIMSBackend.Model;


import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Organization {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    String organization_name;

    String ceo_name;

    String organization_type;

    String mobile_no;

    String email;

    String pan_no;

    @ManyToOne
    @JoinColumn
    Country country;

    String address;

    String gst_no;

    String aadhar_no;

    String license_no;

    @ManyToOne
    @JoinColumn
    Role role;

    String password;

    @ManyToOne
    SuperAdmin super_master_admin;


}
