package br.com.sampaio.trabalho1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Period;

import static org.junit.jupiter.api.Assertions.*;

class PacienteTest {

    @Test
    public void teste_tempoInternacao_sucesso(){
        //arranje
        Paciente paciente = new Paciente("Julio","Masculino",
                LocalDate.of(1996,9,23), LocalDate.of(2021,4,30));
        //act
        LocalDate dataInternacaoFim = LocalDate.of(2021,5,30);
        Period tempoInternacao = Period.of(0,1,0);

        //act
        Period periodoResultado = paciente.calculaTempoInternacao(dataInternacaoFim);

        //assertions
        Assertions.assertEquals(tempoInternacao, periodoResultado);
    }
}