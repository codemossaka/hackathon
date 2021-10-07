package ru.sberbank.hackathonconsumer.entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Date;

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

    private Date createdAt;
}
