package ListaHerancaEPolimorfismo.animais;

import ListaHerancaEPolimorfismo.animais.abstratas.AnimalAB;
import ListaHerancaEPolimorfismo.animais.abstratas.AnimalCorredorAB;
import ListaHerancaEPolimorfismo.animais.concretas.*;

import java.util.ArrayList;

public class MainAnimais {
    public static void main(String[] args) {

        ArrayList<AnimalAB> animaisLista = new ArrayList<>();

        AnimalAB cachorro = new Cachorro("Cachorro", 3);
        animaisLista.add(cachorro);

        AnimalAB cavalo = new Cavalo("Cavalo", 8);
        animaisLista.add(cavalo);

        AnimalAB preguica = new Preguica("Preguica", 5);
        animaisLista.add(preguica);

        for (AnimalAB animal : animaisLista) {
            animal.emitirSom();
        }

        Veterinario veterinario = new Veterinario();

        for (AnimalAB animal : animaisLista) {
            veterinario.examinar(animal);
        }

        Zoologico zoologico = new Zoologico();

        zoologico.povoarJaulas();

        for (AnimalAB animal : zoologico.getJaulas()) {
            System.out.println();
            animal.emitirSom();
            if (animal instanceof AnimalCorredorAB) {
                ((AnimalCorredorAB) animal).correr();
            }
        }


    }
}
