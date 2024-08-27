package ListaHerancaEPolimorfismo.funcionarios.concretas;

import ListaHerancaEPolimorfismo.funcionarios.abstratas.Funcionario;

public class FuncionarioEnsinoBasico extends Funcionario {

    private String escolaBasica;

    public FuncionarioEnsinoBasico(String codigoFuncional, String escolaBasica) {
        super(codigoFuncional);
        this.adicionalEscolaridade=1.1;
        this.escolaBasica = escolaBasica;
        this.rendaEscolaridade*=this.adicionalEscolaridade;
    }

    public String getEscolaBasica() {
        return this.escolaBasica;
    }

    public void setEscolaBasica(String escolaBasica) {
        this.escolaBasica = escolaBasica;
    }

    @Override
    public String toString() {
        return super.toString() + "\nEscola Básica: " + escolaBasica;
    }
}