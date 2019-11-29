package br.com.calcard.service;


import br.com.calcard.repository.AlunoRepository;
import br.com.calcard.model.Aluno;
import br.com.calcard.model.Turma;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.management.RuntimeOperationsException;
import java.util.List;

@Service
public class AlunoService {

    @Autowired
    private AlunoRepository repository;

    @Autowired
    private TurmaService turmaService;

    public Aluno getByName(String nome){
        if(nome==null || nome.isEmpty()){
            throw new RuntimeOperationsException(new RuntimeException(), "Parametro aluno vazio!");
        }
        return repository.findByNome(nome);
    }

    public List<Aluno> list(){
        return repository.findAll();
    }

    public void create(Aluno aluno) {
        repository.save(aluno);
    }

    public void update(Aluno aluno) {
        if (aluno.getId() == null){
            throw new RuntimeOperationsException(new RuntimeException(), "Aluno ainda não presente no cadastro!");
        }
        Aluno entity = repository.findById(aluno.getId()).get();
        Turma turma = turmaService.update(aluno.getTurma());
        entity.setTurma(turma);
        entity.merge(aluno);
        repository.save(entity);
    }

    public void delete(Integer id) {
        Aluno entity = repository.findById(id).get();
        repository.delete(entity);
    }
}
