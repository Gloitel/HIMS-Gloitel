package com.HIMSBackend.HIMSBackend.Dto.Response;


import lombok.*;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ResponseDto {

    String message;
    boolean success;

}
