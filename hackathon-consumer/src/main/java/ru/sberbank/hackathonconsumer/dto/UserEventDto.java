package ru.sberbank.hackathonconsumer.dto;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class UserEventDto {
    private Long id;
    private Long userId;
    private Long doorId;

    private Long exitRoomId;
    private Long entryRoomId;
    private Timestamp createdAt;
}
