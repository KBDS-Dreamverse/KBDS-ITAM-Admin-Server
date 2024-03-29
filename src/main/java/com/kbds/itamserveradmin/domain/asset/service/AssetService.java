package com.kbds.itamserveradmin.domain.asset.service;

import com.kbds.itamserveradmin.domain.asset.dto.AssetRes;
import com.kbds.itamserveradmin.domain.asset.dto.ManualLogRes;
import com.kbds.itamserveradmin.domain.asset.entity.Asset;
import com.kbds.itamserveradmin.domain.asset.entity.ManualLog;
import com.kbds.itamserveradmin.domain.contract.service.ContractService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@RequiredArgsConstructor
public class AssetService {

    private final ContractService contractService;
    private final  ManualLogService manualLogService;

    @Transactional
    public AssetRes getInfo(String contId) {
        Asset asset = contractService.findAstIdByContId(contId);
        if (asset == null) {
            return null;
        }
        return AssetRes.assetInfo(asset);
    }

    @Transactional
    public ManualLogRes getInstallGuide(String contId) {
        Asset asset = contractService.findAstIdByContId(contId);
        if (asset == null) {
            return null;
        }
        ManualLog manualLog = manualLogService.findByAsset_AstId(asset.getAstId());
        if (manualLog == null){
            return null;
        }
        return ManualLogRes.installGuideRes(manualLog);
    }

}
