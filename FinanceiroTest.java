package br.com.sampaio.trabalho1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class FinanceiroTest {

    @Test
    void pagandoFuncionarios(){
        //arranje
        Funcionario medico = new Medico("wellington","masculino",
                LocalDate.of(1996,9,23),LocalDate.of(2021,1,1),
                "123456",40,30,5000,"1234",
                true,10);

        Funcionario gerente = new Gerente("wellington","masculino",
                LocalDate.of(1996,9,23),LocalDate.of(2021,1,1),
                "123456",40,30,5000,"1234",null);

        List<Funcionario> funcionarios = Arrays.asList(medico, gerente);

        Financeiro financeiro = new Financeiro(funcionarios);
        Map<Funcionario, Double> expected = new HashMap<>();
        expected.put(medico, 9250d);
        expected.put(gerente, 6200d);

        //act
        Map<Funcionario, Double> pagamentoPorFuncionario = financeiro.pagandoFuncionarios();

        //assert
        Assertions.assertEquals(expected, pagamentoPorFuncionario);
    }

}