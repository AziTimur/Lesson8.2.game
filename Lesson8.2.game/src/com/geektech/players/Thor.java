package com.geektech.players;

import com.geektech.players.Boss;
import com.geektech.players.EnumSuperAbility;
import com.geektech.players.Hero;

import java.util.Random;

public class Thor extends Hero {
    public Thor(int health, int damage, String name, EnumSuperAbility superAbility) {
        super(health, damage, name, superAbility);
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] avengers) {
        Random random=new Random();
        int integer = random.nextInt(4);
        for (int i = 0; i < avengers.length; i++) {
            if (avengers[i].getHealth() > 0 && avengers[i] != this && avengers[i].getHealth() > 0) {
                switch (integer) {
                    case 1:
                        avengers[i].setHealth(avengers[i].getHealth() + boss.getDamage());
                        break;
                    default:
                        boss.setDamage(50);
                        break;
                }

            }
        }
        System.out.println("Thor оглушил ");


    }


}
