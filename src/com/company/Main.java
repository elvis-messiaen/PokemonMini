package com.company;

public class Main {

    public static void main(String[] args) {
        Pokemon normal = new Pokemon("normal", 300, 300, "feu");

        Pokemon plante = new Pokemon("attaque", 800, 600, "plante");


        PokemonFeu pokemonFeu = new PokemonFeu("pokeFeu", 600, 150, "feu");
        PokemonEau pokemonEau = new PokemonEau("pokeHo",200,250,"eau");
        PokemonPlante poke = new PokemonPlante("pokeplanteOne", 300, 600, "plante");

        pokemonFeu.attaquer(normal);

        System.out.println(pokemonFeu.getNom()
                + " attaque Le pokemon "
                + normal.getNom()
                + " viens de subir une attaque, il lui reste "
                + "\n"
                + normal.getHp()
                + " points de vie");
        poke.life(normal);



    }
}
