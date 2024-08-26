package ListaHerancaEPolimorfismo.animais.concretas;

import ListaHerancaEPolimorfismo.animais.abstratas.AnimalCorredorAB;

public class Cavalo extends AnimalCorredorAB {

    public Cavalo(String nome, int idade) {
        super(nome, idade);
    }

     @Override
    public void emitirSom() {
        System.out.println("O "+nome+" relincha!");
    }
}