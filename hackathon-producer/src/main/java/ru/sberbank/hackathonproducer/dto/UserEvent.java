package ru.sberbank.hackathonproducer.dto;

import lombok.*;

import java.sql.Timestamp;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class UserEvent {
    private Long id;
    private Long userId;
    private Long doorId;
    private Long exitDoorId;
    private Long entryDoorId;

    @Setter(AccessLevel.NONE)
    private Timestamp createdAt;

    public UserEvent(){
        this.createdAt = Timestamp.valueOf(LocalDateTime.now());
    }
}
