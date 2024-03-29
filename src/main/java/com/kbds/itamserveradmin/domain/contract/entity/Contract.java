package com.kbds.itamserveradmin.domain.contract.entity;

import com.kbds.itamserveradmin.domain.asset.entity.Asset;
import com.kbds.itamserveradmin.domain.corporation.entity.Corporation;
import com.kbds.itamserveradmin.domain.purchaseRequest.entity.NewAssetRequest;
import com.kbds.itamserveradmin.domain.user.entity.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Contract {
    @Id
    private String contId;

    @ManyToOne
    @JoinColumn(name = "ast_id")
    private Asset ast;

    @ManyToOne
    @JoinColumn(name = "corp_id")
    private Corporation corp;

    @OneToOne
    private NewAssetRequest newAstReq;

    @ManyToOne
    @JoinColumn(name = "usr_id")
    private User user;

    @OneToMany(mappedBy = "contract", fetch = FetchType.LAZY)
    private List<ContractRecord> records = new ArrayList<>();

    private LocalDateTime contRegDate;
    private String contLicTag;
    private int contPrice;
    private String contAdminName;
    private String contVer;
    private OpStatus contOpStatus;
    private String contName;

    @PrePersist
    public void prePersist() {
        LocalDateTime now = LocalDateTime.now();
        contRegDate = now;
    }

}
