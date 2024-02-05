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
public class Department {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    Long id;

    String departmentName;
    String departmentDescription;

    @OneToMany(mappedBy = "department", cascade = CascadeType.ALL)
    private List<Designation> designations;


}
