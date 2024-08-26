package ListaHerancaEPolimorfismo.funcionarios.concretas;

import ListaHerancaEPolimorfismo.funcionarios.enums.Comissao;

public class FuncionarioEnsinoMedio extends FuncionarioEnsinoBasico{

       protected String escolaEnsinoMedio;

    public FuncionarioEnsinoMedio(String codigoFuncional, String escolaBasica, String escolaEnsinoMedio) {
        super(codigoFuncional, escolaBasica);
        this.adicionalEscolaridade=1.5;
        this.escolaEnsinoMedio = escolaEnsinoMedio;
        this.rendaEscolaridade*=this.adicionalEscolaridade;
    }

    public String getEscolaEnsinoMedio() {
        return this.escolaEnsinoMedio;
    }

    public void setEscolaEnsinoMedio(String escolaEnsinoMedio) {
        this.escolaEnsinoMedio = escolaEnsinoMedio;
    }

    @Override
    public String toString() {
        return super.toString() + ", Escola Ensino Médio: " + escolaEnsinoMedio;
    }

}
