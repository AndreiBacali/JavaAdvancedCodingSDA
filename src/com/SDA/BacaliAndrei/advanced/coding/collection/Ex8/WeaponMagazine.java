package com.SDA.BacaliAndrei.advanced.coding.collection.Ex8;

import java.util.LinkedList;

public class WeaponMagazine {
    private final int maxSize;
    private final LinkedList<String> bullets = new LinkedList<>();

    public WeaponMagazine(int maxSize) {
        this.maxSize = maxSize;
    }

    public void loadBullet(String bullet) {
        if (bullets.size() < maxSize) {
            bullets.addLast(bullet);
        } else {
            System.out.println("Max size " + maxSize + " reached!");
        }
    }

    public boolean isLoaded() {
        return !bullets.isEmpty();
    }
    public void shot(){
        if (isLoaded()){
            System.out.println(bullets.removeLast());
        }else {
            System.out.println("Empty magazine!");
        }
    }
}
