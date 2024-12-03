package entities;

import entities.Enums.SorcererWeapons;

public class Sorcerer extends Character {

    private SorcererWeapons weapons;

    public Sorcerer(String name, SorcererWeapons weapons) {
        super(name, 1300.00, 1500, 300, 400);
        this.weapons = weapons;
    }

    @Override
    public void skill() {
        setHealth(getHealth()+(getHealth()*0.20));
    }

    @Override
    public void special(Character character) {
        double dano = 0.10 * getStrength();
        character.setHealth(character.getHealth() - dano);
    }

    @Override
    public void atacar(Character character) {
        double dano = 0.10 * getStrength();
        character.setHealth(character.getHealth() - dano);
    }

    @Override
    public Double getMaxHealth() {
        return 1300.00;
    }

    @Override
    public void Infos(Character character){
        System.out.println("Nome: "+getName()+" Arma: "+getWeapons()+" Vida Total: "+getMaxHealth()+" Inteligência: "+getIntelligence()+" Força:  "+getStrength()+" Vigor:"+getVigor());
    }
}
