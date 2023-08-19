package main.java.cli.filmes.catalogo.models;

import java.time.LocalDate;
import java.time.Period;

public abstract class Pessoa {
    protected String nome;
    protected String sobrenome;
    protected LocalDate dob;
    protected String nacionalidade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public Integer getIdade() {
        return Period.between(this.dob, LocalDate.now()).getYears();
    }

    public void atualizarNome(Pessoa pessoa, String nome, String sobrenome){
        pessoa.setNome(nome);
        pessoa.setSobrenome(sobrenome);
    }

    public void atualizarNacionalidade(Pessoa pessoa, String Nacionalidade){
        pessoa.setNacionalidade(Nacionalidade);
    }

    public void atualizarAniversario(Pessoa pessoa, LocalDate dob){
        pessoa.setDob(dob);
    }

    public String getNomeCompleto(){
        return (this.getNome() + " " + this.getSobrenome());
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", idade = " + getIdade() +
                ", nacionalidade='" + nacionalidade + '\'' +
                '}';
    }
}
