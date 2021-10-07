package ru.sberbank.hackathonconsumer.entities;

import javax.persistence.*;

@Entity
@Table(name="Arm")
public class Arm {

    @Id
    private Long id;

    private String status;

    @OneToOne
    @JoinColumn(name="router_id")
    private Long router;
}
