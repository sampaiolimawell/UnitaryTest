package br.com.sampaio.trabalho1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class GerenteTest {

    @Test
    void testPagamentoLiberado(){
        Funcionario funcionarioA = new Funcionario("Wellington", "Masculino",
                LocalDate.of(1996, 9, 23), LocalDate.of(2021, 1, 24),
                "1234", 25d, 160d, 4000d);

        Funcionario funcionarioB = new Funcionario("Wellington", "Masculino",
                LocalDate.of(1996, 9, 23), LocalDate.of(2021, 1, 24),
                "1234", 25d, 160d, 4000d);

        Funcionario funcionarioC = new Funcionario("Wellington", "Masculino",
                LocalDate.of(1996, 9, 23), LocalDate.of(2021, 1, 24),
                "1234", 25d, 100d, 4000d);

        List<Funcionario> funcionarios = Arrays.asList(funcionarioA, funcionarioB, funcionarioC);

        Funcionario gerente = new Gerente("Wellington","Masculino",
                LocalDate.of(1996, 9, 23),LocalDate.of(2021, 1, 24),
                "1324",25d,160d,4000d,"1234",funcionarios);

        Map<Funcionario, Boolean> mapFuncionarios =
                ((Gerente) gerente).verificaPagamentosLiberadosPorFuncionario();

        Assertions.assertEquals(true, mapFuncionarios.get(funcionarioA));
        Assertions.assertEquals(false, mapFuncionarios.get(funcionarioC));
        Assertions.assertEquals(true, mapFuncionarios.get(funcionarioB));

    }


}