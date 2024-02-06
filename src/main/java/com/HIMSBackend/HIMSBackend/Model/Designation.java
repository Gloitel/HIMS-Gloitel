package com.HIMSBackend.HIMSBackend.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Null;
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
    @NotNull(message = "Designation Description can not be null")
    String designationDescription;
    @NotNull(message = "Designation Name can not be null")
    String designationName;

    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;


}
