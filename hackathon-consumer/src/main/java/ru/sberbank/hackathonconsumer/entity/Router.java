package ru.sberbank.hackathonconsumer.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Data
@Entity
@Table(name="router")
public class Router {

    @Id
    private Long id;

    private String name;
}
