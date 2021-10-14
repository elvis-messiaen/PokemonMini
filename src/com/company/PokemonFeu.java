package com.company;

public class PokemonFeu extends Pokemon {

    public PokemonFeu(String nom, int hp, int atk, String type) {
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
        if(this.getType().equals("feu") && p.getType().equals("plante")){
            attaque = (attaque * 2);
            vie -= attaque;
            p.setHp(vie);
        }else if(this.getType().equals("feu") && p.getType().equals("eau")){
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
        return "PokemonFeu{}";
    }
}
