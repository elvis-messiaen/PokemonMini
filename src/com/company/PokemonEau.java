package com.company;
/*
    les Pokémon de type Feu sont super efficaces contre les Pokémon de type Plante
    et leur infligent deux fois plus de dégâts (2*atk).

 */
public class PokemonEau extends Pokemon{
    public PokemonEau(String nom, int hp, int atk, String type) {
        super(nom, hp, atk, type);
    }

    @Override
    public int getHp() {
        return super.getHp();
    }

    @Override
    public int attaquer(Pokemon p) {
        int vie = p.getHp();
        int attaque = getAtk();
        if(this.getType().equals("eau") && p.getType().equals("feu")){
            attaque = (attaque * 2);
            vie -= attaque;
            p.setHp(vie);
        }else if(this.getType().equals("eau") && p.getType().equals("plante")){
            attaque = (attaque / 2);
            vie -= attaque;
            p.setHp(vie);
        }else{
            vie -= attaque;
            p.setHp(vie);
        }
        return p.getHp();
    }



    @Override
    public String toString() {
        return "PokemonEau{}";
    }
}
