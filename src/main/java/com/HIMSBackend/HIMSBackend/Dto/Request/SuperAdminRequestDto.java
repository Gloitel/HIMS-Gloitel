package com.HIMSBackend.HIMSBackend.Dto.Request;

import com.HIMSBackend.HIMSBackend.Enum.RoleType;
import com.HIMSBackend.HIMSBackend.Model.Country;
import lombok.*;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class SuperAdminRequestDto {
    String name;
    String email;
    String phone_no;
    String password;
}
