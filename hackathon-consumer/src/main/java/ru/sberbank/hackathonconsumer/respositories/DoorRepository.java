package ru.sberbank.hackathonconsumer.respositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.sberbank.hackathonconsumer.entities.Door;

@Repository
public interface DoorRepository extends JpaRepository<Door, Long> {
}
