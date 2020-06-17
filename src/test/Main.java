package test;

import br.com.projuris.CustoCargo;
import br.com.projuris.CustoDepartamento;
import br.com.projuris.MeuCalculo;
import br.com.projuris.Funcionario;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Funcionario funcionario1 = new Funcionario("Assistente", "Administrativo", new BigDecimal(1000.0));
        Funcionario funcionario2 = new Funcionario("Gerente", "Administrativo", new BigDecimal(7000.70));
        Funcionario funcionario3 = new Funcionario("Diretor", "Administrativo", new BigDecimal(10000.45));
        Funcionario funcionario4 = new Funcionario("Assistente", "Financeiro", new BigDecimal(1300.9));
        Funcionario funcionario5 = new Funcionario("Gerente", "Financeiro", new BigDecimal(7500.0));
        Funcionario funcionario6 = new Funcionario("Diretor", "Financeiro", new BigDecimal(11000.0));
        Funcionario funcionario7 = new Funcionario("Estagiário", "Jurídico", new BigDecimal(700.4));
        Funcionario funcionario8 = new Funcionario("Assistente", "Jurídico", new BigDecimal(1800.9));
        Funcionario funcionario9 = new Funcionario("Gerente", "Jurídico", new BigDecimal(9500.5));
        Funcionario funcionario10 = new Funcionario("Diretor", "Jurídico", new BigDecimal(13000.0));

        ArrayList<Funcionario> funcionarioList = new ArrayList<>();
        funcionarioList.add(funcionario1);
        funcionarioList.add(funcionario2);
        funcionarioList.add(funcionario3);
        funcionarioList.add(funcionario4);
        funcionarioList.add(funcionario5);
        funcionarioList.add(funcionario6);
        funcionarioList.add(funcionario7);
        funcionarioList.add(funcionario8);
        funcionarioList.add(funcionario9);
        funcionarioList.add(funcionario10);

        MeuCalculo meuCalculo = new MeuCalculo();
//        myCalculation.costPerDepartament(workerList);
        List<CustoCargo> custosCargo = meuCalculo.custoPorCargo(funcionarioList);
        List<CustoDepartamento> custoDepartamentos = meuCalculo.custoPorDepartamento(funcionarioList);

        for(CustoCargo custoCargo : custosCargo){
            System.out.println("O cargo " + custoCargo.getCargo() +
                    " tem um custo no total de R$" + custoCargo.getCusto());
        }

        System.out.println("--------------------------------------------------------------------------");

        for(CustoDepartamento custoDepartamento : custoDepartamentos){
            System.out.println("O departamento " + custoDepartamento.getDepartamento() +
                    " tem um custo no total de R$" + custoDepartamento.getCusto());
        }
    }
}
