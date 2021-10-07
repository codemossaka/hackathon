package ru.sberbank.hackathonconsumer.entities;

import lombok.Data;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;

@Data
@Entity
@Table(name = "userEvent")
public class UserEvent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private User user;

    @ManyToOne
    private Door door;

    @ManyToOne
    private Room exit;

    @ManyToOne
    private Room entry;

    private Timestamp createdAt;
}
