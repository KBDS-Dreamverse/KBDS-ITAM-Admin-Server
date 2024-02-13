package com.kbds.itamserveradmin.domain.cooperation.dto;

import lombok.*;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RegisterCooperationDto {
    String corpName;
    String crn;
    String corpContact;
    String corpAddr;
    String corpUrl;
    String corpOwner;
    String corpRemarks;
    boolean isSubCorp;
}
