package br.com.sampaio.trabalho1;

import java.time.LocalDate;
import java.time.Period;

public class Paciente extends Pessoa {
    private LocalDate dataInternacaoInicio;
    private  LocalDate dataInternacaoFim;

    public Paciente(String nome, String sexo, LocalDate dataNascimento, LocalDate dataInternação) {
        super(nome, sexo, dataNascimento);
        this.dataInternacaoInicio = dataInternação;
    }

    public LocalDate getDataInternação() {
        return dataInternacaoInicio;
    }

    public Period calculaTempoInternacao(LocalDate dataInternacaoFim) {
        return Period.between(dataInternacaoInicio,dataInternacaoFim);
    }
}
