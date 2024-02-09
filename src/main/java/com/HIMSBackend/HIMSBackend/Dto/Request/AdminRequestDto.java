package com.HIMSBackend.HIMSBackend.Dto.Request;


import lombok.*;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class AdminRequestDto {

    String name;
    String email;
    String phone_no;
}
