package com.SDA.BacaliAndrei.advanced.coding.collection.Ex8;

/**
 * Ex 8
 * Create a class imitating a weapon magazine.
 * The class should be able to define the size of the magazine using the constructor.
 * Implement the methods:
 * loadBullet(String bullet) → adding a cartridge to the magazine, does not allow loading more cartridges than the capacity of the magazine
 * isLoaded() → returns information about whether the weapon is loaded (at least one cartridge) or not
 * shot() → each call shots one bullet (prints string value in console) - the last loaded cartridge - and prepares the next one, loaded before the last one, if there are no more cartridges, it prints "empty magazine" in the console
 */
public class Main {
    public static void main(String[] args) {
        WeaponMagazine weapon=new WeaponMagazine(8);
        weapon.loadBullet("bullet1");
        weapon.loadBullet("bullet2");
        weapon.loadBullet("bullet3");
        weapon.loadBullet("bullet4");
        weapon.loadBullet("bullet5");
        weapon.loadBullet("bullet6");
        weapon.loadBullet("bullet7");
        weapon.loadBullet("bullet8");
        weapon.loadBullet("bullet9");

        System.out.println(weapon.isLoaded());

        weapon.shot();
        weapon.shot();
        weapon.shot();
        weapon.shot();
        weapon.shot();
        weapon.shot();
        weapon.shot();
        weapon.shot();
        weapon.shot();

        System.out.println(weapon.isLoaded());
    }
}
