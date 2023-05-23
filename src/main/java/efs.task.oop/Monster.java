interface Fighter {
    void attack(Fighter victim);
    void takeHit(int damage);
}

public abstract class Monster implements Fighter {
    private int health;
    private int damage;
    private Boolean isAlive;

    public Monster(int health, int damage) {
        this.health = health;
        this.damage = damage;
        isAlive = true;
    }
    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public Boolean getAlive() {
        return isAlive;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void setAlive(Boolean alive) {
        isAlive = alive;
    }
}