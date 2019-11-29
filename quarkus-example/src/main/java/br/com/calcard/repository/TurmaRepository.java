package br.com.calcard.repository;

import br.com.calcard.model.Turma;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;

import javax.enterprise.context.RequestScoped;

@RequestScoped
public class TurmaRepository implements PanacheRepositoryBase<Turma, Integer> {

    public Turma findByNome(String name) {
        return find("name", name).firstResult();
    }
}
