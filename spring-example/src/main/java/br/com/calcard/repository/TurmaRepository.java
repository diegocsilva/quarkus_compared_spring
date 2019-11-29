package br.com.calcard.repository;

import br.com.calcard.model.Turma;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TurmaRepository extends JpaRepository<Turma, Integer> {

    public Turma findByAno(Integer ano);
}
