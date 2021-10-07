package ru.sberbank.hackathonconsumer.respositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.sberbank.hackathonconsumer.entities.Router;

@Repository
public interface RouterRepository extends JpaRepository<Router, Long> {
}
