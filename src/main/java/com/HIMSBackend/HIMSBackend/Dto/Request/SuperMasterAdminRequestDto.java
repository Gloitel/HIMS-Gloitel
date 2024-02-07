package com.HIMSBackend.HIMSBackend.Dto.Request;

import com.HIMSBackend.HIMSBackend.Model.Country;
import com.HIMSBackend.HIMSBackend.Model.Role;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class SuperMasterAdminRequestDto {


    String company_name;
    String comapny_type;
    String ceo_name;
    String mobile_no;
    String email;
    String address;
    String pan_no;
    String aadhar_no;
    String gst_no;
    Country country;
}
