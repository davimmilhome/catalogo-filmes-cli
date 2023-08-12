package main.java.cli.filmes.catalogo.models;

import java.time.LocalDate;

public class Ator extends Pessoa{

    public Ator(String nome, String sobrenome, LocalDate dob, String nacionalidade){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dob = dob;
        this.nacionalidade = nacionalidade;
    }

    @Override
    public String toString() {
        return "Ator{" +
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", dob=" + dob +
                ", idade=" + getIdade() +
                ", nacionalidade='" + nacionalidade + '\'' +
                '}';
    }
}
