package com.company;

import com.sun.security.jgss.GSSUtil;

public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHp(10000);
        boss.setDamage(4000);
        boss.weapon.setWeaponNeam("awm");
        boss.weapon.setWeaponType("снайперский");
        boss.printlnfo();

        Skeleton skeleton = new Skeleton();
        skeleton.setHp(240);
        skeleton.setDamage(997);
        skeleton.weapon.setWeaponType("scar");
        skeleton.weapon.setWeaponNeam("автоматчичечкий");
        skeleton.printlnfo();


        Skeleton skeleton2 = new Skeleton();
        skeleton2.setHp(240);
        skeleton2.setDamage(997);
        skeleton2.weapon.setWeaponType("scar");
        skeleton2.weapon.setWeaponNeam("автоматчичечкий");
        skeleton2.printlnfo();
    }
}
