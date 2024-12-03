package entities;

import entities.Enums.ThiefWeapons;
import entities.Enums.WarriorWeapons;

public class Thief extends Character {
    private ThiefWeapons thiefWeapons;
    public Thief(String name, ThiefWeapons weapons) {
        super(name, 1400.00, 1600, 200, 30);
        this.thiefWeapons = weapons;
    }

    @Override
    public void skill() {

    }

    @Override
    public void special(Character character) {
        System.out.println("Ataque mais uma rodada!");
    }

    @Override
    public void atacar(Character character) {
        double dano = 0.10 * getStrength();
        character.setHealth(character.getHealth() - dano);
    }

    @Override
    public Double getMaxHealth() {
        return 1400.00;
    }
    @Override
    public void Infos(Character character){
        System.out.println("Nome: "+getName()+" Arma: "+getWeapons()+" Vida Total: "+getMaxHealth()+" Inteligência: "+getIntelligence()+" Força:  "+getStrength()+" Vigor:"+getVigor());
    }
}
