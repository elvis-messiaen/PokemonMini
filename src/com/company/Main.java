package com.company;

public class Main {

    public static void main(String[] args) {
        Pokemon feu = new Pokemon("defenseur", 600, 300,"feu");

        Pokemon plante = new Pokemon("attaque", 600, 600,"plante");

        PokemonFeu pokemonFeu = new PokemonFeu("pokeFeu", 600,100,"feu");
        pokemonFeu.attaquer(plante);
        System.out.println( pokemonFeu.getNom()
                +  " attaque Le pokemon "
                + feu.getNom()
                + " Il lui reste "
                + "\n"
                + plante.getHp()
                + " points de vie");
        System.out.println(plante.isDead());
        System.out.println(plante);


    }
}
