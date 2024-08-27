package ListaHerancaEPolimorfismo.animais.abstratas;

public abstract class AnimalCorredorAB extends AnimalAB{
    public AnimalCorredorAB(String nome, int idade) {
        super(nome, idade);
    }

    public void correr(){
        System.out.println("O "+this.nome+" corre!");
    }
}