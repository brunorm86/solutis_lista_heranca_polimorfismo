package ListaHerancaEPolimorfismo.animais.concretas;

import ListaHerancaEPolimorfismo.animais.abstratas.AnimalAB;

public class Zoologico {
    AnimalAB[] jaulas = new AnimalAB[10];

    public void setJaulas(AnimalAB[] jaulas) {
        this.jaulas = jaulas;
    }

    public AnimalAB[] getJaulas() {
        return jaulas;
    }

    public void povoarJaulas(){
        for(int i = 0; i < this.jaulas.length; i++){
            if(i%3==0){
                AnimalAB cachorro = new Cachorro("Cão "+i, (i+1));
                this.jaulas[i] = cachorro;
            } else if(i%3==1){
                AnimalAB cavalo = new Cavalo("Cavalo "+i, (i+1));
                this.jaulas[i] = cavalo;
            }  else {
            AnimalAB preguica = new Preguica("Preguiça "+i, (i+1));
            this.jaulas[i] = preguica;
            }
        }
    }
}
