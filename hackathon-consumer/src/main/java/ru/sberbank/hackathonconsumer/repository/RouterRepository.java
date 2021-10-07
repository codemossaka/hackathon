package ru.sberbank.hackathonconsumer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.sberbank.hackathonconsumer.entity.Router;

@Repository
public interface RouterRepository extends JpaRepository<Router, Long> {
}
