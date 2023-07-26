package br.ufpb.dcx.lab1v1.controladores;

import br.ufpb.dcx.lab1v1.modelo.Disciplina;
import br.ufpb.dcx.lab1v1.servicos.ServicoDaDisciplina;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
@AllArgsConstructor
@RestController
public class ControladorDisciplina {
private ServicoDaDisciplina servicoDaDisciplina;

    @PostMapping("/v1/api/disciplinas")
    public ResponseEntity<Disciplina> adicionarDisciplina(Disciplina disciplina){
        return ResponseEntity.status(HttpStatus.CREATED).body(servicoDaDisciplina.AdicionarDisciplina(disciplina));

    }

}
