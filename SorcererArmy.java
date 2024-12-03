package entities;

public class SorcererArmy extends AbstractArmy {

    public SorcererArmy(Sorcerer sorcerer) {
        super(sorcerer);
    }

    @Override
    public String WarCry() {
        return "Destruição gera criação!";
    }

    @Override
    public void atacar(Character character) {
        double dano = 0.20*getStrength();
        character.setHealth(character.getHealth() - dano);
    }

}
