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
public class Gender {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    @Column(name = "gender_name", nullable = false, unique = true)
    @Enumerated(EnumType.STRING)
    private GenderType gender;  // Use an enum for clarity and control

    // Define the GenderType enum
    public enum GenderType {
        MALE,
        FEMALE,
        OTHER
    }
}
