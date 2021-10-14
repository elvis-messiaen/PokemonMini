package com.company;

public class Pokemon {
    private String nom;
    private int hp;
    private int atk;
    private boolean isDead;
    private String type;

    public Pokemon() {

    }

    public Pokemon(String nom, int hp, int atk, String type) {
        this.nom = nom;
        this.hp = hp;
        this.atk = atk;
        this.type = type;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isDead() {
        if (this.hp <= 0) {

            isDead = true;
        }
        return isDead;
    }

    public void life(Pokemon p) {
        if(p.isDead()){
            System.out.println("votre Pokemon viens de mourir");
        }
    }

    public int attaquer(Pokemon p) {
        p.hp -= this.getAtk();
        return hp;
    }

    @Override
    public String toString() {
        return "Pokemon{" +
                "nom='" + nom + '\'' +
                ", hp=" + hp +
                ", atk=" + atk +
                ", isDead=" + isDead +
                '}';
    }
}
