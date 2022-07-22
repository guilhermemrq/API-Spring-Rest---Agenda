package io.github.guilhermemrq.agendaapi.model.repository;

import io.github.guilhermemrq.agendaapi.model.entity.Contato;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContatoRepository extends JpaRepository<Contato, Integer> {
}
