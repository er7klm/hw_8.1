package kg.geektech.les8.players;

import java.util.Random;

public class Thor extends Hero {

    public Thor(int damage, int health, String name) {
        super(damage, health, SuperAbility.DEAFENING_BLOW, name);
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        Random random = new Random();
        int rnd = random.nextInt(1);
        if (rnd == 1) {
            for (int i = 0; i < heroes.length; i++) {
                heroes[i].setHealth(heroes[i].getHealth() + boss.getDamage());
            }
        }
    }
}
