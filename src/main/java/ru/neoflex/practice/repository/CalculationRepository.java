package ru.neoflex.practice.repository;

import ru.neoflex.practice.model.Calculation;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CalculationRepository extends JpaRepository<Calculation, Long> {
}
