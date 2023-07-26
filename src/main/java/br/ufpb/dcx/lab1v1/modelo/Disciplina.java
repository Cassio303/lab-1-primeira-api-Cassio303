package br.ufpb.dcx.lab1v1.modelo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Disciplina {
    private int id;
    private String nome;
    private int like;
    private List <Double> notas;

}
