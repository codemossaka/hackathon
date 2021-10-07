package ru.sberbank.hackathonconsumer.respositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.sberbank.hackathonconsumer.entities.Arm;

public interface ArmRepository extends JpaRepository<Arm, Long> {
}
