package com.kbds.itamserveradmin.domain.contract.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class LicenseKey {
    @Id
    private String licKeyId;

    private KeyStatus licKeyStatus;

    //==연관관계==//
//    @ManyToOne
//    @JoinColumn(name = "cont_id")
//    private Contract contract;
}
