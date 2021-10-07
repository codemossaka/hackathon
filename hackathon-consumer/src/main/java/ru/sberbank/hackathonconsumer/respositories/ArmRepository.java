package ru.sberbank.hackathonconsumer.respositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.sberbank.hackathonconsumer.entities.Arm;

@Repository
public interface ArmRepository extends JpaRepository<Arm, Long> {
}
