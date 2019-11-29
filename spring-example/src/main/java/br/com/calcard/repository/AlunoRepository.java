package br.com.calcard.repository;

import br.com.calcard.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Integer> {

    public Aluno findByNome(String name);

    public Aluno findBySobrenome(String sobrenome);
}
