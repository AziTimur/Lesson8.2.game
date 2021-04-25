package com.geektech.players;

import java.util.Random;

public class CaptainAmerica extends Hero {
    Random random = new Random();

    public CaptainAmerica(int health, int damage, String name,
                          EnumSuperAbility superAbility) {
        super(health, damage, name, superAbility);
        // this.shieldStrike=shieldStrike;
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] avengers) {
        for (int i = 0; i < avengers.length; i++) {
            avengers[i].setDamage(25);
            if (avengers[i].getHealth() > 0 && avengers[i] == this) {
                if (avengers[i].getHealth() > 0 && avengers[i] == this) {
                    avengers[i].setDamage(avengers[i].getDamage() + random.nextInt(boss.getDamage()));
                    System.out.println(avengers[i].getName() + " получил  " + (avengers[i].getDamage() - 25)+
                            " и ударил "+avengers[i].getDamage());
                }
            }
        }
    }
}
