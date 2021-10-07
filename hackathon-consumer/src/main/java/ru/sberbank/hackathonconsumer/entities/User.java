package ru.sberbank.hackathonconsumer.entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "user", schema = "public")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String fullname;

    @OneToOne
    private Arm arm;

    @ManyToOne
    private Router router;
}
