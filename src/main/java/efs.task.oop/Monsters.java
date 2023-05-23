public class Monsters {
    public static final Monster andariel = new Monster(10, 70) {
        @Override
        public void attack(Fighter victim) {
            victim.takeHit(getDamage());
        }

        @Override
        public void takeHit(int damage) {
            setHealth(getHealth() - damage);
            monstersHealth -= damage;
        }
    };

    public static final Monster blacksmith = new Monster(100, 25) {
        @Override
        public void attack(Fighter victim) {
            victim.takeHit(getDamage());
        }

        @Override
        public void takeHit(int damage) {
            setHealth(getHealth() - damage - 5);
            monstersHealth -= damage + 5;
        }
    };

    public static int monstersHealth = andariel.getHealth() + blacksmith.getHealth();
}
