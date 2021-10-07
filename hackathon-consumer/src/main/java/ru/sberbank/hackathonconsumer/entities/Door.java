package ru.sberbank.hackathonconsumer.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Door")
public class Door {

    @Id
    private Long id;

    private String name;
}
