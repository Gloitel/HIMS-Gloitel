package com.HIMSBackend.HIMSBackend.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.format.annotation.DateTimeFormat;

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
    @NotNull(message = "First name can not be null")
    String firstName;

    String middleName;
    @NotNull(message = "Last Name can not be null")
    String lastName;
    @NotNull(message = "Phone No can not be null")
    Long phone_no;
    @NotNull(message = "Email can not be null")
    String personal_Email;
    @NotNull(message = "Birth can not be null")
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    Date birthDate;
    @NotNull(message = "Company provided mail can not be null")
    String CompanyProvidedMail;
    @NotNull(message = "Password can not be null")
    String Password;

}
