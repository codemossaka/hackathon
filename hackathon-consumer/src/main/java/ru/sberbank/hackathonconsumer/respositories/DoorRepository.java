package ru.sberbank.hackathonconsumer.respositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.sberbank.hackathonconsumer.entities.Door;

public interface DoorRepository extends JpaRepository<Door, Long> {
}
