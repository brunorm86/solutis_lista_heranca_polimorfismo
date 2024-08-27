package ListaHerancaEPolimorfismo.animais.concretas;

import ListaHerancaEPolimorfismo.animais.abstratas.AnimalAB;

public class Preguica extends AnimalAB {

    public Preguica(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("A "+nome+" grita!");
    }

    public void subirEmArvores() {

    }

}