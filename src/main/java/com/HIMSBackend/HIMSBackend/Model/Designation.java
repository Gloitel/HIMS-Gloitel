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
public class Designation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    String designationDescription;
    String designationName;

    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;


}
