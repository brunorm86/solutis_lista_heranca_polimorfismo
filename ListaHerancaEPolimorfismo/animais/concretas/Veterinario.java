package ListaHerancaEPolimorfismo.animais.concretas;

import ListaHerancaEPolimorfismo.animais.abstratas.AnimalAB;

public class Veterinario {

    public void examinar(AnimalAB animal){
        System.out.println("O Veterinário examinou "+animal.getNome());
        animal.emitirSom();
    }

}
