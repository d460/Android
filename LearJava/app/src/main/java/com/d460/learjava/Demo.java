package com.d460.learjava;

/**
 * Created by Dagoberto on 14/09/2016.
 */

public class Demo {
    public static void main(String[] args) {

//        Enemy enemy = new Enemy("test enemy",10,3);
//        enemy.showInfo();
//        enemy.takeDamage(3);
//        enemy.showInfo();
//        enemy.takeDamage(11);
//        enemy.showInfo();

//        Troll uglyTroll = new Troll("Ugly troll");
//        uglyTroll.showInfo();
//        uglyTroll.takeDamage(30);
//
//        Vampyre vlad = new Vampyre("Vlad");
//        vlad.showInfo();
//        vlad.takeDamage(8);
//        vlad.showInfo();
//


//        VampyreKing king = new VampyreKing("King");
//        king.showInfo();
//
//        king.setLives(0);
//        do{
//            if (king.dodges()) {
//                king.setLives(king.getLives()+1);
//                continue;
//            }
//            if (king.runAway()) {
//                System.out.println("The Vampyre King ran away");
//                break;
//            } else {
//                king.takeDamage(80);
//                king.showInfo();
//            }
//        }while (king.getLives() > 0);
//        System.out.println("=====================================");

        Player conan = new Player("Conan");
        conan.pickUpLoot(new Loot("Invisibility",LootType.POTION,4));
        conan.pickUpLoot(new Loot("Mithril",LootType.ARMOR,183));
        conan.pickUpLoot(new Loot("Ring of speed",LootType.RING,25));
        conan.pickUpLoot(new Loot("Red potion",LootType.POTION,2));
        conan.pickUpLoot(new Loot("Cursed Shield",LootType.ARMOR,-8));
        conan.pickUpLoot(new Loot("Brass ring",LootType.RING,1));
        conan.pickUpLoot(new Loot("Chain mail",LootType.ARMOR,4));
        conan.pickUpLoot(new Loot("Gold ring",LootType.RING,12));
        conan.pickUpLoot(new Loot("Health potion",LootType.POTION,3));
        conan.pickUpLoot(new Loot("Silver ring",LootType.RING,6));
        conan.showInventory();

        System.out.println(conan.score());
        System.out.println("=================================");
        conan.dropLoot("Cursed Shield");
        System.out.println(conan.score());



//        Player dago = new Player();
//        System.out.println(dago.getHandleName());
//        dago.setHandleName("Dago");
//        System.out.println(dago.getHandleName());
//        System.out.println("Level: " + dago.getLevel());
//        System.out.println("Lives: " + dago.getLives());
//          dago.setNameAndLevel("Dago",10);
//          System.out.println(dago.getHandleName());
//          System.out.println("Level: " + dago.getLevel());
//          System.out.println("Lives: " + dago.getLives());
//          System.out.println(dago.getWeapon().getName());
//
//        Weapon myAxe = new Weapon("Goldshine Axe",15,50);
//        dago.setWeapon(myAxe);
//        System.out.println(dago.getWeapon().getName());
//        System.out.println(dago.getWeapon().getDamageInflicted());
//        System.out.println(dago.getWeapon().getHitPoints());

//        Loot redPotion = new Loot("Red Potion", LootType.POTION, 7);
//        dago.pickUpLoot(redPotion);
//
//        dago.pickUpLoot(new Loot("+3 Armor", LootType.ARMOR, 80));
//        dago.pickUpLoot(new Loot("Ring of protection +2", LootType.RING, 40));
//        dago.pickUpLoot(new Loot("Invisibility Potion", LootType.POTION, 85));
//
//        dago.showInventory();
//
//        //Loot bluePotion = new Loot("Blue Potion", LootType.POTION,6);
//        boolean wasDeleted = dago.dropLoot(redPotion);
//        System.out.println(wasDeleted);
//        dago.showInventory();


//        Player magy = new Player("Magy");
//        magy.setLives(5);
//        System.out.println(magy.getHandleName());
//        System.out.println("Level: " + magy.getLevel());
//        System.out.println("Lives: " + magy.getLives());
//
//        Player abra = new Player("Abra", 9);
//        System.out.println(abra.getHandleName());
//        System.out.println("Level: " + abra.getLevel());
//        System.out.println("Lives: " + abra.getLives());
    }
}
