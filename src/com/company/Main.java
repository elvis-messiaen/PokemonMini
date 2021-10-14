package com.company;

public class Main {

    public static void main(String[] args) {
        Pokemon normal = new Pokemon("normal", 300, 300, "feu");

        Pokemon plante = new Pokemon("attaque", 800, 600, "plante");


        PokemonFeu pokemonFeu = new PokemonFeu("pokeFeu", 200, 150, "feu");

        PokemonEau pokemonEau = new PokemonEau("pokeHo", 400, 250, "eau");

        PokemonPlante poke = new PokemonPlante("pokeplanteOne", 300, 200, "plante");

        poke.attaquer(pokemonFeu);

        poke.display(poke, pokemonFeu);

    }
}
