package br.com.calcard.repository;

import br.com.calcard.model.Aluno;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;

import javax.enterprise.context.RequestScoped;

@RequestScoped
public class AlunoRepository implements PanacheRepositoryBase<Aluno, Integer> {

    public Aluno findByNome(String name) {
        return find("name", name).firstResult();
    }

    public Aluno findBySobrenome(String sobrenome) {
        return find("sobrenome", sobrenome).firstResult();
    }
}
