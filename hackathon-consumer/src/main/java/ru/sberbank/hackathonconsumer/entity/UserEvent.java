package ru.sberbank.hackathonconsumer.entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Date;

@Data
@Entity
public class UserEvent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "user_id", table = "User")
    private User userId;

    @OneToOne
    @JoinColumn(name = "door_id", table = "Router")
    private Long doorId;

    @OneToOne
    @JoinColumn(name = "room_id", table = "Room")
    private Room exitRoom;

    @OneToOne
    @JoinColumn(name = "room_id", table = "Room")
    private Room entryRoom;

    private Date time;
}
