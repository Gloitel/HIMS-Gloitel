package com.HIMSBackend.HIMSBackend.Model;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Null;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Country {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    Long id;
  
    @NotNull(message = "Country Name can not be null")
    String countryName;
  
    @Null(message = "Country Description not be null")
    String countryDescription;

    @OneToMany(mappedBy = "country", cascade = CascadeType.ALL)
    List<Organization> organizationList;



}
