package Gerenciamento.de.Autores.ex4.Repository;

import Gerenciamento.de.Autores.ex4.Model.AutoresModel;
import jakarta.persistence.Entity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AutoresRepository extends JpaRepository<AutoresModel, Long> {
}

