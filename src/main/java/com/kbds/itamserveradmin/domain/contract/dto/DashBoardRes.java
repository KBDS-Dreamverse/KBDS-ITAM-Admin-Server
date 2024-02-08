package com.kbds.itamserveradmin.domain.contract.dto;

import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Builder
public class DashBoardRes {

    private String contName;

    /**
     * 라이선스 이름 리스트
     * */
    private List<String> licNames = new ArrayList<>();





}
