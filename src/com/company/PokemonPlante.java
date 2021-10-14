package com.company;

public class PokemonPlante extends Pokemon{

    public PokemonPlante(String nom, int hp, int atk, String type) {
        super(nom, hp, atk, type);
    }

    @Override
    public int getHp() {
        return super.getHp();
    }

    @Override
    public int attaquer(Pokemon p) {

        if(this.getType().equals("feu") && p.getType().equals("plante")){
         //   p.setHp(getHp()/2);



          //  p.hp -= this.getAtk();
        }
        return getHp();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
