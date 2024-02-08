package com.HIMSBackend.HIMSBackend.Model;

import com.HIMSBackend.HIMSBackend.Enum.RoleType;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
//@DiscriminatorValue("ADMIN")
public class Admin extends Common {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn
    SuperAdmin super_admin;

    // Getters and setters
}
