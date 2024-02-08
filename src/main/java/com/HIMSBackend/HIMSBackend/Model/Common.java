package com.HIMSBackend.HIMSBackend.Model;

import com.HIMSBackend.HIMSBackend.Enum.RoleType;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;


import java.util.Date;
import java.util.Set;
@MappedSuperclass
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Common {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "is_activated")
    private boolean isActivated;

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;

    @Enumerated(EnumType.STRING)
    @Column(name = "role")
    private RoleType role;

    @Column(name = "role_type")
    private String roleType;


    @Embedded
    private Personal personal;

    @Column(name = "password")
    private String password;

//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "avatar_id")
//    private UploadSchema avatar;

    @Column(name = "dob")
    private Date dob;

//    @Enumerated(EnumType.STRING)
//    @Column(name = "gender")
//    private Gender gender;

    @Enumerated(EnumType.STRING)
    @Column(name = "gender")
    private Gender.GenderType gender;

    @Column(name = "profession")
    private String profession;

    @Column(name = "city")
    private String city;

    @Column(name = "state")
    private String state;

    @Column(name = "country")
    private String country;

    @Column(name = "address")
    private String address;

    @Column(name = "otp")
    private String otp;

    @Column(name = "referral_code")
    private String referralCode;

    @Column(name = "is_email_set")
    private boolean isEmailSet;

    @Column(name = "is_email_verified")
    private boolean isEmailVerified;

    @Column(name = "email_token")
    private String emailToken;

    @Column(name = "phone_number") // new added
    private String phoneNumber;

    @Column(name = "is_phone_number_set")
    private boolean isPhoneNumberSet;

    @Column(name = "is_phone_number_verified")
    private boolean isPhoneNumberVerified;

    @Column(name = "phone_number_token")
    private String phoneNumberToken;

    @Column(name = "is_password_set")
    private boolean isPasswordSet;

    @Column(name = "is_password_verified")
    private boolean isPasswordVerified;

    @Column(name = "password_token")
    private String passwordToken;

    // Getters and setters
}