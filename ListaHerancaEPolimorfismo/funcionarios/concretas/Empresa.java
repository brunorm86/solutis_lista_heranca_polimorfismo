package ListaHerancaEPolimorfismo.funcionarios.concretas;

import ListaHerancaEPolimorfismo.funcionarios.abstratas.Funcionario;
import ListaHerancaEPolimorfismo.funcionarios.enums.Comissao;

public class Empresa {
    Funcionario[] funcionarios = new Funcionario[10];


    public Empresa() {
        this.funcionarios = new Funcionario[10];
    }


    public void setFuncionarios(Funcionario[] jaulas) {
        this.funcionarios = jaulas;
    }

    public Funcionario[] getfuncionarios() {

        return funcionarios;
    }

    public void povoarFuncionarios() {
        //cria os funcionarios conforme enunciado exercício 7
        for (int i = 0; i < funcionarios.length; i++) {
            if (i < (Integer) funcionarios.length * .4) {
                Funcionario funcEnsBas = new FuncionarioEnsinoBasico("" + i, "EEB São João");
                this.funcionarios[i] = funcEnsBas;
            } else if (i < (Integer) funcionarios.length * .8) {
                Funcionario funcEnsMed = new FuncionarioEnsinoMedio("" + i, "EEB Maria do Carmo",
                        "Instituto Politécnico");
                this.funcionarios[i] = funcEnsMed;
            } else if (i >= (Integer) funcionarios.length * .8) {
                Funcionario funcGrad = new FuncionarioGraduacao("" + i, "EEB Maria do Carmo",
                        "Instituto Politécnico", "UFSC");

                this.funcionarios[i] = funcGrad;
            }
        }
    }

    public void comissionaFuncionarios() {
        //comissiona funcionarios já existentes conforme enunciado do exercício 10
        for (int i = funcionarios.length - 1; i >= 0; i--) {
            if (i < (Integer) funcionarios.length * .7) {
                this.funcionarios[i].setComissao(Comissao.VENDEDOR);
            } else if (i < (Integer) funcionarios.length * .9) {
                this.funcionarios[i].setComissao(Comissao.SUPERVISOR);
            } else {
                this.funcionarios[i].setComissao(Comissao.GERENTE);
            }
        }
    }

    public void calcularCustos() {
        double custoEnsBas = 0;
        double custoEnsMed = 0;
        double custoGrad = 0;

        for (Funcionario funcionario : funcionarios) {
            if (funcionario instanceof FuncionarioGraduacao) {
                custoGrad += funcionario.calculaRendaTotal();
            } else if (funcionario instanceof FuncionarioEnsinoMedio) {
                custoEnsMed += funcionario.calculaRendaTotal();
            } else {
                custoEnsBas += funcionario.calculaRendaTotal();
            }
        }

        System.out.println("\nCustos com funcionários:\n" +
                "Ensino Básico: R$" + custoEnsBas + "" +
                "\nEnsino Médio: R$" + custoEnsMed + "" +
                "\nEnsino Graduacao: R$" + custoGrad + "" +
                "\nCusto total: R$" + (custoEnsBas + custoEnsMed + custoGrad) + "" +
                "\nCusto médio por funcionário: R$" + ((custoEnsBas + custoEnsMed + custoGrad) / funcionarios.length));

    }

    public void imprimeListaFuncionarios() {
        String string = "";
        for (Funcionario funcionario : funcionarios) {
            string += funcionario.toString();
        }
        System.out.println(string);
    }
}
