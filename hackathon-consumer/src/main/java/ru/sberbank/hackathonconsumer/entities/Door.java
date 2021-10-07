package ru.sberbank.hackathonconsumer.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "door")
@AllArgsConstructor
@NoArgsConstructor
public class Door {

    @Id
    private Long id;

    private String name;
}
