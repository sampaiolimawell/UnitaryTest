package br.com.sampaio.trabalho1;

import java.time.LocalDate;

public class Medico  extends Funcionario{
    private String CRM;

    private boolean operando = false;

    private int numeroCirurgia;

    public Medico(String nome, String sexo, LocalDate dataNascimento, LocalDate dataAdmissao, String matricula, double valorHora,
                  int horasTrabalhadas, double salario, String CRM, boolean operando, int numeroCirurgia) {
        super(nome, sexo, dataNascimento, dataAdmissao, matricula, valorHora, horasTrabalhadas, salario);
        this.CRM = CRM;
        this.operando = operando;
        this.numeroCirurgia = numeroCirurgia;
    }

    public String getCRM() {
        return CRM;
    }

    public boolean isOperando() {
        return operando;
    }

    public int getNumeroCirurgia() {
        return numeroCirurgia;
    }
    public void operar(){
        operando = true;
    }
    @Override
    public double calculoSalario(){
        if (getNumeroCirurgia()>=10){
            double ganhouAumento = (getSalario()*25)/100 + getSalario();
            return ganhouAumento;
        }else {
            return getSalario();
        }
//
    }
}
