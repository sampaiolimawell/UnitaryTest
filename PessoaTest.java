package br.com.sampaio.trabalho1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class PessoaTest {

    void constridoPessoa(){
        Pessoa pessoa = new Pessoa("Wellington", "Masculino",
                LocalDate.of(1996, 9, 23));

        String sexo = pessoa.getSexo();
        LocalDate dataNascimento = pessoa.getDataNascimento();
        String nome = pessoa.getNome();

        Assertions.assertEquals("Masculino", sexo);
        Assertions.assertEquals("Wellington", nome);
        Assertions.assertEquals(LocalDate.of(1996, 9, 23), dataNascimento);
    }

    @Test
    public void teste_idadePessoa_sucesso() {
        //arranje
        Pessoa pessoa = new Pessoa("Wellington", "Masculino",
                LocalDate.of(1996, 9, 23));
        //act
        int idade = pessoa.calculoIdade();

        //assert
        Assertions.assertEquals(24,idade);
    }
}