package ListaHerancaEPolimorfismo.funcionarios.abstratas;

import ListaHerancaEPolimorfismo.funcionarios.enums.Comissao;

public abstract class Funcionario {

    protected final double RENDA_BASICA = 1000;

    protected Comissao comissao;

    protected double adicionalEscolaridade = 1;

    protected String codigoFuncional;

    protected double rendaEscolaridade;



    public Funcionario(String codigoFuncional) {

        this.codigoFuncional = codigoFuncional;
        this.comissao = Comissao.SEM_COMISSAO;
        this.rendaEscolaridade = RENDA_BASICA*adicionalEscolaridade;

    }

    public double getRENDA_BASICA() {
        return RENDA_BASICA;
    }

    public Comissao getComissao() {
        return comissao;
    }

    public void setComissao(Comissao comissao) {
        this.comissao = comissao;
    }

    public double getAdicionalEscolaridade() {
        return adicionalEscolaridade;
    }

    public void setAdicionalEscolaridade(double adicionalEscolaridade) {
        this.adicionalEscolaridade = adicionalEscolaridade;
    }

    public String getCodigoFuncional() {
        return codigoFuncional;
    }

    public void setCodigoFuncional(String codigoFuncional) {
        this.codigoFuncional = codigoFuncional;
    }

    public double getRendaEscolaridade() {
        return rendaEscolaridade;
    }

    public void setRendaEscolaridade(double rendaEscolaridade) {
        this.rendaEscolaridade = rendaEscolaridade;
    }

    public double calculaRendaTotal() {
        return this.rendaEscolaridade+this.comissao.getAdicional();
    }

    @Override
    public String toString() {
        return "\n----------------------"+
                "\nCódigo Funcional: " + codigoFuncional+
                "\nComissão: " + comissao+
                "\nRenda Escolaridade: " + rendaEscolaridade+
                "\nValor Comissão: " + comissao.getAdicional()+
                "\nRenda total: " + calculaRendaTotal();

    }
}
