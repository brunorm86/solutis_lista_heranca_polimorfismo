package ListaHerancaEPolimorfismo.funcionarios;

import ListaHerancaEPolimorfismo.funcionarios.concretas.Empresa;

public class MainFuncionarios {
    public static void main(String[] args) {
        Empresa emp = new Empresa();

        emp.povoarFuncionarios();
        emp.comissionaFuncionarios();
        emp.calcularCustos();
        emp.imprimeListaFuncionarios();
    }
}
