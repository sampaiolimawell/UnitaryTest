package br.com.sampaio.trabalho1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Financeiro {


    private List<Funcionario> funcionarios;

    public Financeiro(List<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

    public Map<Funcionario, Double> pagandoFuncionarios() {
        Map<Funcionario, Double> mapPagandoFuncionarios = new HashMap<>();
        for (Funcionario funcionarioLoop : funcionarios) {
            double pagandoSalario = funcionarioLoop.calculoSalario();

            if (funcionarioLoop instanceof Medico &&
                    ((Medico) funcionarioLoop).getCRM().equalsIgnoreCase("1234")) {
                pagandoSalario += 3000;
            } else if (funcionarioLoop instanceof Gerente &&
                    ((Gerente) funcionarioLoop).getCRA().equalsIgnoreCase("1234")){
                pagandoSalario += 5000;
            }


            mapPagandoFuncionarios.put(funcionarioLoop,pagandoSalario);

        }
        return mapPagandoFuncionarios;

    }


}
