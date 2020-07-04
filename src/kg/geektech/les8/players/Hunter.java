package kg.geektech.les8.players;

public class Hunter extends Hero {

    public Hunter(int damage, int health, String name) {
        super(damage, health, SuperAbility.SAVE_DAMAGE_AND_REVERT, name);
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getAbility() == SuperAbility.SAVE_DAMAGE_AND_REVERT) {
                heroes[i].setDamage(heroes[i].getDamage() + (boss.getDamage() / 5));
            }
        }
    }
}
