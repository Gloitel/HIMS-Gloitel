package com.HIMSBackend.HIMSBackend.Dto.Response;


import lombok.*;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class SuperAdminResponseDto {

    String company_name;
    String ceo_name;
    String message;

}
