package ru.sberbank.hackathonconsumer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.sberbank.hackathonconsumer.entity.Door;

@Repository
public interface DoorRepository extends JpaRepository<Door, Long> {
}
