package br.com.projuris;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class MeuCalculo implements Calculo {

    @Override
    public List<CustoCargo> custoPorCargo(List<Funcionario> funcionarios) {
        ArrayList<CustoCargo> listaCargo = new ArrayList<>();
        for (Funcionario funcionario : funcionarios) {
            String cargo = funcionario.getCargo();
            BigDecimal custo = funcionario.getSalario();
            boolean cadastraNovoCargo = cadastrarNovaCargo(listaCargo, cargo);

            if (cadastraNovoCargo){
                listaCargo.add(new CustoCargo(cargo, custo));
            } else {
                for (CustoCargo CargoLista : listaCargo){
                    if(CargoLista.getCargo().equals(cargo)){
                        BigDecimal valorAtual = CargoLista.getCusto();
                        CargoLista.setCusto(valorAtual.add(custo));
                    }
                }
            }
        }
        return listaCargo;
    }

    @Override
    public List<CustoDepartamento> custoPorDepartamento(List<Funcionario> funcionarios) {
        ArrayList<CustoDepartamento> listaDeparamento = new ArrayList<>();
        for (Funcionario funcionario : funcionarios) {
            String departamento = funcionario.getDepartamento();
            BigDecimal custo = funcionario.getSalario();
            boolean cadastraNovo = cadastrarNovaDepartamento(listaDeparamento, departamento);

            if (cadastraNovo) {
                listaDeparamento.add(new CustoDepartamento(departamento, custo));
            } else {
                for (CustoDepartamento departamentoLista : listaDeparamento) {
                    if (departamentoLista.getDepartamento().equals(departamento)) {
                        BigDecimal valorAtual = departamentoLista.getCusto();
                        departamentoLista.setCusto(valorAtual.add(custo));
                        }
                    }
                }
            }
        return listaDeparamento;
    }

    public boolean cadastrarNovaCargo(ArrayList<CustoCargo> cargos, String cargo) {
        boolean cadastraNovoCargo = true;
        for (CustoCargo cargoLista : cargos) {
            if (!cargoLista.getCargo().equals(cargo)) {
                cadastraNovoCargo = true;
            } else {
                cadastraNovoCargo = false;
                break;
            }
        }
        return  cadastraNovoCargo;
    }

    private boolean cadastrarNovaDepartamento(ArrayList<CustoDepartamento> listaDeparamento, String departamento) {
        boolean cadastraNovoDepartamento = true;
        for (CustoDepartamento departamentos : listaDeparamento) {
            if (!departamentos.getDepartamento().equals(departamento)) {
                cadastraNovoDepartamento = true;
            } else {
                cadastraNovoDepartamento = false;
                break;
            }
        }
        return cadastraNovoDepartamento;
    }
}
