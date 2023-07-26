package br.ufpb.dcx.lab1v1.servicos;

import br.ufpb.dcx.lab1v1.modelo.Disciplina;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ServicoDaDisciplina {

    List <Disciplina> disciplinaList = new ArrayList<>();
    public Disciplina AdicionarDisciplina(Disciplina disciplina){

        disciplinaList.add(disciplina);
        return disciplina;
    }
}
