package com.d460.learjava;

/**
  * Created by Dagoberto on 18/09/2016.
 */

public class Enemy {
    private String name;
    private int hitPoint;
    private int lives;

    public Enemy(String name, int hitPoint, int lives) {
        this.name = name;
        this.hitPoint = hitPoint;
        this.lives = lives;
    }

    public void takeDamage(int damage){
        int remainingHitPoints = this.hitPoint - damage;
        if (remainingHitPoints > 0){
            setHitPoint(remainingHitPoints);
            System.out.println("I took " + damage + " points damage, and have " + remainingHitPoints + " left.");
        } else {
            this.lives = this.lives - 1;
            if (lives > 0){
                System.out.println("I've lost a life");
            } else {
                System.out.println("No lives left, I'm Dead!");
            }


        }
    }

    public void showInfo(){
        System.out.println("Name: " + this.name + " Hitpoints: " + this.hitPoint + " Lives: " +this.lives);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHitPoint() {
        return hitPoint;
    }

    public void setHitPoint(int hitPoint) {
        this.hitPoint = hitPoint;
    }

    public int getLives() {
        return lives;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }

}
