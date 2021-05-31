package br.com.sampaio.trabalho1;

import java.time.LocalDate;
import java.time.Period;

public class Pessoa {

    private String nome;

    private String sexo;

    private LocalDate dataNascimento;

    public Pessoa(String nome, String sexo, LocalDate dataNascimento) {
        this.nome = nome;
        this.sexo = sexo;
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public String getSexo() {
        return sexo;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public int calculoIdade(){
        Period period = Period.between(dataNascimento, LocalDate.now());
        return period.getYears();
    }
}
