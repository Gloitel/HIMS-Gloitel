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
public class Department {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    Long id;

    @NotNull(message = "Department Name can not be null")
    String departmentName;
    @NotNull(message = "department Name can not be null")
    String departmentDescription;

    @OneToMany(mappedBy = "department", cascade = CascadeType.ALL)
    private List<Designation> designations;


}
