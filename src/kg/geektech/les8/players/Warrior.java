package kg.geektech.les8.players;

import java.util.Random;

public class Warrior extends Hero {

    private final int min = 2;
    private final int max = 4;

    Random random = new Random();
    int rnd = random.nextInt(max - min) + min;

    public Warrior(int damage, int health, String name) {
        super(damage, health, SuperAbility.CRITICAL_DAMAGE, name);
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        if (heroes[0].getHealth() > 0) {
            heroes[0].setDamage(heroes[0].getDamage() * rnd);

        }
    }
}
