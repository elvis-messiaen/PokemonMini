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
        int vie = p.getHp();
        int attaque = getAtk();
        if(this.getType().equals("plante") && p.getType().equals("eau")){
            attaque = (attaque * 2);
            vie -= attaque;
            p.setHp(vie);
        }else if(this.getType().equals("plante") && p.getType().equals("feu")){
            attaque = (int)(0.5 * attaque);
            vie -= attaque;
            p.setHp(vie);
        }else{
            vie -= attaque;
            p.setHp(vie);
        }
        return p.getHp();
    }
    public void display (Pokemon attaquant, Pokemon defense){
        System.out.println(attaquant.getNom()
                + " attaque Le pokemon "
                + defense.getNom()
                + "\n"
                + "Il viens de subir une attaque enracinement"
                + "\n"
                +"Il lui reste "
                + defense.getHp()
                + " points de vie");
        attaquant.life(defense);
    }



    @Override
    public String toString() {
        return "PokemonEau{}";
    }
}
