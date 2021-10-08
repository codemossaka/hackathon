package ru.sberbank.hackathonconsumer.entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="router")
public class Router {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
}
