package com.HIMSBackend.HIMSBackend.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.naming.Name;
import java.util.Date;

@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Hr_Details {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    String first_name;
    String middle_name;
    String last_name;
    Long phone_no;
    String personal_email;
    Date birth_date;
    String company_provided_mail;
    String password;

}
