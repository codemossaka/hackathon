package ru.sberbank.hackathonconsumer.respositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.sberbank.hackathonconsumer.entities.User;

@Repository
public interface UserRepository  extends JpaRepository<User, Long> {
}
