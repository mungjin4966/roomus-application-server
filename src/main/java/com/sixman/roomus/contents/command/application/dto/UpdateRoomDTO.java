package com.sixman.roomus.contents.command.application.dto;

import lombok.Data;

@Data
public class UpdateRoomDTO {
    private int roomNo;
    private String roomName;
    private Boolean access;
    private String category; // 방 카테고리 정보
    private String description;
    private Integer door; // 문의 위치
}
