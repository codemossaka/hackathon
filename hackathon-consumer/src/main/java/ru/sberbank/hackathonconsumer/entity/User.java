package ru.sberbank.hackathonconsumer.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String fullname;

    @OneToOne
    @JoinColumn(name="router_id", table = "Router")
    private Long armId;

    @OneToOne
    @JoinColumn(name="router_id", table = "Router")
    private Long phoneRouterId;
}
