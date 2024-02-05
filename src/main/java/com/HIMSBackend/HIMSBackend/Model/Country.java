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
public class Country {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    Long id;

    String countryName;

    String countryDescription;

    @OneToMany(mappedBy = "Country", cascade = CascadeType.ALL)
    List<Organization> organizationList;



}
