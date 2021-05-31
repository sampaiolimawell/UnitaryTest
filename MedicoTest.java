package br.com.sampaio.trabalho1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

class MedicoTest {
    @Test
    public void calculaSalarioComAumento() {
        //arranje
        Funcionario medico = new Medico("wellington", "masculino",
                LocalDate.of(1996, 9, 23), LocalDate.of(2021, 1, 1),
                "123456", 40, 30, 5000, "1334",
                true, 10);
        //act
        double comAumento = medico.calculoSalario();

        //assert
        Assertions.assertEquals(6250, comAumento);
    }

    @Test
    public void calculaSalarioSemAumento() {
        //arranje
        Funcionario medico = new Medico("wellington", "masculino",
                LocalDate.of(1996, 9, 23), LocalDate.of(2021, 1, 1),
                "123456", 40, 30, 5000, "1334",
                true, 5);
        //act
        double semAumento = medico.calculoSalario();

        //assert
        Assertions.assertEquals(5000, semAumento);
    }

    @Test
    public void calculoOperando() {
        //arranje
        Pessoa medico = new Medico("wellington", "masculino",
                LocalDate.of(1996, 9, 23), LocalDate.of(2021, 1, 1),
                "123456", 40, 30, 5000, "1334",
                true, 5);
        //act
        ((Medico) medico).isOperando();

        //assert
        Assertions.assertEquals(true, ((Medico) medico).isOperando());
    }


}