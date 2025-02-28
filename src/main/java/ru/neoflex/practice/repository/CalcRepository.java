package ru.neoflex.practice.db.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.neoflex.practice.operation.CalcOperation;

public interface CalcRepository extends JpaRepository<CalcOperation, Integer> {
}
