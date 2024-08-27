package ListaHerancaEPolimorfismo.funcionarios.enums;

public enum Comissao {
    GERENTE(1500),
    SUPERVISOR(600),
    VENDEDOR(250),
    SEM_COMISSAO(0);

    private final double adicional;

    Comissao(double adicional) {
        this.adicional = adicional;
    }

    public double getAdicional() {
        return adicional;
    }
}
