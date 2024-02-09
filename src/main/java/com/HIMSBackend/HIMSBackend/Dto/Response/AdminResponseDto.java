package com.HIMSBackend.HIMSBackend.Dto.Response;


import lombok.*;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class AdminResponseDto {

    String name;
    String email;
    String phone_number;
    boolean isActivated;
    boolean isPasswordVerified;
    boolean isPasswordSet;
    boolean isPhoneNumberVerified;
    boolean isPhoneNumberSet;
    boolean isEmailVerified;
    boolean isEmailSet;
}
