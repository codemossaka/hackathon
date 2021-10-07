package ru.sberbank.hackathonconsumer.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="room")
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

}
