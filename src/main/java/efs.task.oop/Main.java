package efs.task.oop;
import javax.swing.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Villager kashya = new Villager("Kashya", 30);
        ExtraordinaryVillager akara = new ExtraordinaryVillager("Akara", 40, ExtraordinaryVillager.Skill.SHELTER);
        Villager gheed = new Villager("Gheed", 50);
        ExtraordinaryVillager deckardCain = new ExtraordinaryVillager("Deckard Cain", 85, ExtraordinaryVillager.Skill.IDENTIFY);
        Villager warriv = new Villager("Warriv", 35);
        Villager flawia = new Villager("Flawia", 25);

        Object objectDeckardCain = deckardCain;
        Object objectAkara = akara;
        //nie można wywołać na nich metod klasy ExtraordinaryVillager
//
//        kashya.sayHello();
//        akara.sayHello();
//        gheed.sayHello();
//        deckardCain.sayHello();
//        warriv.sayHello();
//        flawia.sayHello();

        Villager villagers[] = {kashya, akara, gheed, deckardCain, warriv, flawia};
        for(Villager v: villagers) {
            v.sayHello();
        }


        Monster monsters[] = {Monsters.andariel, Monsters.blacksmith};

        int villagerCounter = 0;
        int monsterCounter = 0;
        while(monsterCounter < 2) {
            villagers[villagerCounter].attack(monsters[monsterCounter]);
            if(monsters[monsterCounter].getHealth() <= 0) {
                monsterCounter += 1;
            }
            if(monsterCounter >= 2) {
                break;
            }
            monsters[monsterCounter].attack(villagers[villagerCounter]);
            if(villagers[villagerCounter].getHealth() <= 0) {
                villagerCounter += 1;
            }

            System.out.println("Potwory posiadaja jeszcze " + Monsters.monstersHealth + " punkty zycia");
            System.out.println("Aktualnie walczacy osadnik to " + villagers[villagerCounter].getName());
        }

        System.out.println("Obozowisko ocalone!");

        deckardCain = (ExtraordinaryVillager) objectDeckardCain;
        akara = (ExtraordinaryVillager) objectAkara;

        deckardCain.sayHello();
        akara.sayHello();
    }
}
