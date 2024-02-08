package com.HIMSBackend.HIMSBackend.Model;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Embeddable
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Personal {

    private String personalEmail;

    private String personalPhoneNumber;

    // Getters and setters
}
