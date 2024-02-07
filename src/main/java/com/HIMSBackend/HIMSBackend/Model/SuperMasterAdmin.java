package com.HIMSBackend.HIMSBackend.Model;

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
public class SuperMasterAdmin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    String company_name;

    String comapny_type;

    String ceo_name;

    String mobile_no;

    String email;

    String address;

    String pan_no;

    String aadhar_no;

    String gst_no;


    @ManyToOne
    @JoinColumn
    Role role;

    String password;


    @ManyToOne
    @JoinColumn
    Country country;

    @OneToMany(mappedBy = "super_master_admin", cascade = CascadeType.ALL)
    List<Organization> organizationList;


}
