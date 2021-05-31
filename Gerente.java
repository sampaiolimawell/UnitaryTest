package br.com.sampaio.trabalho1;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Gerente extends Funcionario {

    private String CRA;
    List<Funcionario> funcionariosGerenciados;

    public Gerente(String nome, String sexo, LocalDate dataNascimento,
                   LocalDate dataAdmissao, String matricula, double valorHora, double horasTrabalhadas,
                   double salario, String CRA,List<Funcionario> funcionariosGerenciados) {
        super(nome, sexo, dataNascimento, dataAdmissao, matricula, valorHora, horasTrabalhadas, salario);
        this.CRA = CRA;
        this.funcionariosGerenciados = funcionariosGerenciados;
    }

    public String getCRA() {
        return CRA;
    }

    public List<Funcionario> getFuncionariosGerenciados() {
        return funcionariosGerenciados;
    }

    public Map<Funcionario, Boolean> verificaPagamentosLiberadosPorFuncionario() {
        Map<Funcionario, Boolean> pagamentosLiberados = new HashMap<>();

        for (Funcionario funcionario : funcionariosGerenciados) {
            if (funcionario.getHorasTrabalhadas() >= 160) {
                pagamentosLiberados.put(funcionario, Boolean.TRUE);
            } else {
                pagamentosLiberados.put(funcionario, Boolean.FALSE);
            }
        }

        return pagamentosLiberados;
    }

}
