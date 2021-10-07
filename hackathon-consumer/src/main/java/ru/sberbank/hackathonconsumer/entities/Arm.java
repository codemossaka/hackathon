package ru.sberbank.hackathonconsumer.entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="arm")
public class Arm {

    @Id
    private Long id;

    private String status;

    @ManyToOne
    private Router router;
}
