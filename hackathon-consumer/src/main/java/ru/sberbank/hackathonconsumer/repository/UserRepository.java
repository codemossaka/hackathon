package ru.sberbank.hackathonconsumer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.sberbank.hackathonconsumer.entity.User;

public interface UserRepository  extends JpaRepository<User, Long> {
}
