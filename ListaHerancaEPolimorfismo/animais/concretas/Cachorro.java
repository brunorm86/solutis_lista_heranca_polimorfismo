package ListaHerancaEPolimorfismo.animais.concretas;

import ListaHerancaEPolimorfismo.animais.abstratas.AnimalCorredorAB;

public class Cachorro extends AnimalCorredorAB {

    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }

        @Override
    public void emitirSom() {
        System.out.println("O "+nome+" late!");
    }
}