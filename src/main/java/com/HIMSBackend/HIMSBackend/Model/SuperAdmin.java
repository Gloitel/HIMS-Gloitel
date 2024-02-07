package com.HIMSBackend.HIMSBackend.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class SuperAdmin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    @NotNull(message = "Company name can not be null")
    String company_name;

    String comapny_type;

    String ceo_name;

    @NotNull(message = "Phone No can not be null")
    String mobile_no;

    @NotNull(message = "Email can not be null")
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
