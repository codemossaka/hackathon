package ru.sberbank.hackathonconsumer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.sberbank.hackathonconsumer.entity.Room;

@Repository
public interface RoomRepository extends JpaRepository<Room, Long> {
}
