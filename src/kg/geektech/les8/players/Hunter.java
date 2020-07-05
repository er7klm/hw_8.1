package kg.geektech.les8.players;

import java.util.Random;

public class Hunter extends Hero {

    public Hunter(int damage, int health, String name) {
        super(damage, health, SuperAbility.SAVE_DAMAGE_AND_REVERT, name);
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        if (heroes[4].getHealth() > 0) {
            heroes[4].setDamage(20 + (boss.getDamage() / 5));
        }
    }
}
