package ru.sberbank.hackathonconsumer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.sberbank.hackathonconsumer.entity.Arm;

@Repository
public interface ArmRepository extends JpaRepository<Arm, Long> {
}
