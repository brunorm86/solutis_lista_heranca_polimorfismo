package ListaHerancaEPolimorfismo.funcionarios.concretas;

public class FuncionarioGraduacao extends FuncionarioEnsinoMedio{

    protected String instituicaoGraduacao;

    public FuncionarioGraduacao(String codigoFuncional, String escolaBasica, String escolaEnsinoMedio, String instituicaoGraduacao) {
        super(codigoFuncional, escolaBasica, escolaEnsinoMedio);
        this.adicionalEscolaridade=2;
        this.instituicaoGraduacao = instituicaoGraduacao;
        this.rendaEscolaridade*=this.adicionalEscolaridade;

    }

    public String getInstituicaoGraduacao() {
        return this.instituicaoGraduacao;
    }

    public void setInstituicaoGraduacao(String instituicaoGraduacao) {
        this.instituicaoGraduacao = instituicaoGraduacao;
    }

    @Override
    public String toString() {
        return super.toString() + ", Instituição Graduação: " + instituicaoGraduacao;
    }
}
