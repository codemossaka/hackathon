package ru.sberbank.hackathonconsumer.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name="door")
public class Door {

    @Id
    private Long id;

    private String name;
}
