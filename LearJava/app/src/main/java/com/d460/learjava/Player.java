package com.d460.learjava;

import java.util.ArrayList;

/**
 * Created by Dagoberto on 14/09/2016.
  */

public class Player {
    private String handleName;
    private int lives;
    private int level;
    private int score;
    private Weapon weapon;
    private ArrayList<Loot> inventory;


    public Player() {
        this("Unknown Name");
    }

    public Player(String handle) {
        this(handle, 1);
//        lives = 4;
//        level = 1;
//        score = 0;
    }

    public Player(String handle, int startingLevel) {
//        this.handleName = handle;
//        this.level = startingLevel;
//        this.lives = 3;
//        this.score = 0;
        setHandleName(handle);
        setLives(3);
        setScore(0);
        setLevel(startingLevel);
        setDefaultMethod();
        inventory = new ArrayList<>();
    }

    public void setNameAndLevel(String name, int level) {
        setHandleName(name);
        setLevel(level);
    }

    public String getHandleName() {
        return handleName;
    }

    public int getLives() {
        return lives;
    }

    public int getLevel() {
        return level;
    }

    public int getScore() {
        return score;
    }

    public void setHandleName(String handleName) {
        if (handleName.length() < 4) {
            System.out.println("The name " + handleName + " is too short, must 4 characters or more");
            return;
        }
        this.handleName = handleName;
    }

    private void setDefaultMethod(){
        this.weapon = new Weapon("Sword",10,20);
    }

    public void setLives(int lives) {
        this.lives = lives;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public ArrayList<Loot> getInventory() {
        return inventory;
    }
//    public void setInventory(ArrayList<Loot> inventory) {
//        this.inventory = inventory;
//    }
    public void pickUpLoot (Loot newLoot){
        inventory.add(newLoot);
    }

    public boolean dropLoot (Loot loot){
        if(this.inventory.contains(loot)) {
            inventory.remove(loot);
            return true;
        }
        return false;
    }

    public boolean dropLoot (String lootName){
        for (Loot currentLoot : inventory){
            if (currentLoot.getName().equals(lootName)){
                inventory.remove(currentLoot);
                return true;
            }
        }
        return false;
    }


    public void showInventory (){
        for (Loot item : inventory) {
            System.out.println(item.getName());
        }
        System.out.println("=================================");
    }

    public int score(){
        int total = 0;
        //for (int i = 0; i < inventory.size(); i++) {
        //    Loot currentLoot = inventory.get(i);
        for (Loot currentLoot: inventory
             ) {
            System.out.println(currentLoot.getName() + " is worth " + currentLoot.getValue());
            total = total + currentLoot.getValue();
        }
        return total;
    }
}
