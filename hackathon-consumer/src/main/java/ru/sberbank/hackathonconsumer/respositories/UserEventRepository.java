package ru.sberbank.hackathonconsumer.respositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.sberbank.hackathonconsumer.entities.UserEvent;

@Repository
public interface UserEventRepository extends JpaRepository<UserEvent, Long> {
}
