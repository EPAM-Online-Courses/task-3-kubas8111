package efs.task.oop;
public class Villager implements Fighter{
    private String name;
    private int age;
    private int health;
    private Boolean isAlive;

    public Villager(String name, int age) {
        this.name = name;
        this.age = age;
        this.health = 100;
        isAlive = true;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getHealth() {
        return health;
    }

    public Boolean getAlive() {
        return isAlive;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setAlive(Boolean alive) {
        isAlive = alive;
    }

    public void sayHello() {
        System.out.println("Greetings traveler... I'm " + getName() + " and I'm " + getAge() + " years old.");
    }

    @Override
    public void attack(Fighter victim) {
        victim.takeHit((int) ((100 - getAge() * 0.5) / 10));
    }

    @Override
    public void takeHit(int damage) {
        health -= damage;
    }
}
