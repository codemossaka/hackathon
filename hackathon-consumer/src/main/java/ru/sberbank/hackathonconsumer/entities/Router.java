package ru.sberbank.hackathonconsumer.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Router")
public class Router {

    @Id
    private Long id;

    private String name;
}
