package com.geektech.players;

import java.util.Random;

public class Hulk extends Hero{

    public Hulk(int health, int damage, String name, EnumSuperAbility superAbility) {
        super(health, damage, name, superAbility);
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] avengers) {
        Random randomHulk = new Random();
        int helpHulk = randomHulk.nextInt(3) + 2;
        for (int i = 0; i < avengers.length; i++) {
            if (avengers[i].getHealth() > 0 && avengers[i] == this) {
                avengers[i].setDamage(avengers[i].getDamage() * helpHulk);
            }
        }
        System.out.println(this.getName() + " умножает  на " + helpHulk);
    }

}
