package br.com.sampaio.trabalho1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

class FuncionarioTest {

    @Test
    void buildFuncionarioTestComDownCast() {
        Pessoa funcionario = new Funcionario("Wellington", "Masculino",
                LocalDate.of(1996, 9, 23), LocalDate.of(2021, 1, 24),
                "1234", 25d, 160d, 4000d);

        Funcionario funcionarioDowCast = (Funcionario) funcionario;

        Double valorHora = funcionarioDowCast.getValorHora();
        Double horasTrabalhadas = funcionarioDowCast.getHorasTrabalhadas();
        String matricula = funcionarioDowCast.getMatricula();

        Assertions.assertEquals(25d, valorHora);
        Assertions.assertEquals(160d, horasTrabalhadas);
        Assertions.assertEquals("1234", matricula);

    }

    @Test
    void calculaSalarioTestComDownCast() {
        Pessoa funcionario = new Funcionario("Wellington", "Masculino",
                LocalDate.of(1996, 9, 23), LocalDate.of(2021, 1, 24),
                "1234", 25d, 160d, 4000d);

        Funcionario funcionarioDowCast = (Funcionario) funcionario;

        Double salario = funcionarioDowCast.calculoSalario();

        Assertions.assertEquals(4000d, salario);

    }
    @Test
    void calculaAumentoSalarioComDowCast(){
        Pessoa funcionario = new Funcionario("Wellington", "Masculino",
                LocalDate.of(1996, 9, 23), LocalDate.of(2021, 1, 24),
                "1234", 25d, 160d, 4000d);

        Funcionario funcionarioDowCast = (Funcionario) funcionario;

        ((Funcionario) funcionario).aumentaSalario(10d);
        Double valorFinalAumento = ((Funcionario) funcionario).getValorHora();

        Assertions.assertEquals(35d,valorFinalAumento);

    }

}