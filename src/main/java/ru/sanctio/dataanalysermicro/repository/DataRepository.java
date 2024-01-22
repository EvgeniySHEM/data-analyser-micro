package ru.sanctio.dataanalysermicro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.sanctio.dataanalysermicro.model.Data;

public interface DataRepository extends JpaRepository<Data, Long> {
}
