package ru.sberbank.hackathonconsumer.respositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.sberbank.hackathonconsumer.entities.Router;

public interface RouterRepository extends JpaRepository<Router, Long> {
}
