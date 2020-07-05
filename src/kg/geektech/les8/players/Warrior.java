package kg.geektech.les8.players;

import java.util.Random;

public class Warrior extends Hero {

    public Warrior(int damage, int health, String name) {
        super(damage, health, SuperAbility.CRITICAL_DAMAGE, name);
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        Random random = new Random();
        int rnd = random.nextInt(3) + 1;
        if (heroes[0].getHealth() > 0) {
            heroes[0].setDamage(15 * rnd);
        }
    }
}
