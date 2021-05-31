package br.com.sampaio.trabalho1;

import java.time.LocalDate;

public class Funcionario extends Pessoa {
    private LocalDate dataAdmissao;

    private String matricula;

    private double valorHora;

    private double horasTrabalhadas;

    private double salario;

    public Funcionario(String nome, String sexo, LocalDate dataNascimento, LocalDate dataAdmissao,
                       String matricula, double valorHora, double horasTrabalhadas, double salario) {
        super(nome, sexo, dataNascimento);
        this.dataAdmissao = dataAdmissao;
        this.matricula = matricula;
        this.valorHora = valorHora;
        this.horasTrabalhadas = horasTrabalhadas;
        this.salario = salario;
    }

    public LocalDate getDataAdmissao() {
        return dataAdmissao;
    }

    public String getMatricula() {
        return matricula;
    }

    public double getValorHora() {
        return valorHora;
    }

    public double getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public double getSalario() {
        return salario;
    }

    //functions
    public double aumentaSalario(double aumento) {

        return valorHora += aumento;
    }

    public double calculoSalario() {

        return salario = valorHora * horasTrabalhadas;
    }
}
