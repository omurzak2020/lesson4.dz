package com.company;

public class Main {

    public static int bossHealth = 700;
    public static int bossDamage = 50;
    public static int[] medicHealth = {150, 150};
    public static int[] medicDamage = {10, 10};
    public static String[] medicAttackType = {"medic1 ", " medic2 "};
    public static String bossDefentType = "";
    public static int[] heroesHealth = {250, 200, 150};
    public static int[] heroesDamage = {20, 40, 15};
    public static String[] heroesAttacktype = {
            "warrial", "Magic", "Kinetick"};
    public static int roundNumber = 0;

    public static void main(String[] args) {
        System.out.println("Game Start ");
        prinstatictic();
        while (!isGameFinished()){
            roundNumber++;
            System.out.println("Round " + roundNumber);
        round();
        }
    }

    public static void round(){
        heroeshit();
        medicPomochMarial();
        bossHits();
        bossHitsMedic();
        prinstatictic();

    }
    public static boolean isGameFinished() {
        if (bossHealth <= 0) {
            System.out.println("heroes won!!!");
            return true;
        }
        if (heroesHealth[0] <= 0 && heroesHealth[1] <= 0
                && heroesHealth[2] <= 0) {
            System.out.println("boss won!!!");
            return true;

        }

        if (medicHealth[0] <= 0 && medicHealth[1] <= 0) {
           medicPomochMarial();
//            System.out.println("boss won!!!");
//            return true;
        }
        return false;

    }

    public static void bossHits(){
        for (int i = 0; i < heroesHealth.length; i++) {
            if (heroesHealth[i] > 0){
                if (heroesHealth[i] < bossDamage){
                    heroesHealth[i] = 0;
                }else
            heroesHealth[i] = heroesHealth[i] - bossDamage;}

        }
    }

    public static void heroeshit(){
        for (int i = 0; i < heroesDamage.length; i++) {
            if (bossHealth > 0){
                if (bossHealth -heroesDamage[i] < 0){
                   bossHealth = 0;
                }else {
            bossHealth = bossHealth - heroesDamage[i];}
            }else {
                break;
            }
        }
    }


    public static void bossHitsMedic(){
        for (int i = 0; i < medicHealth.length; i++) {
            if (medicHealth[i] > 0){
            medicHealth[i] = medicHealth[i] - bossDamage;}
        }
    }

    public static void medicPomochMarial(){
        for (int i = 0; i < medicDamage.length; i++) {
            heroesHealth[2] = heroesHealth[2] + medicDamage[i];
        }
    }

    public static void prinstatictic(){
        System.out.println("____________");
        System.out.println("boss Health: " + bossHealth);
        System.out.println("Warial Health: " + heroesHealth[0]);
        System.out.println("magic Health: " + heroesHealth[1]);
        System.out.println("Kinetick Health: " + heroesHealth[2]);
        System.out.println("Medic Health1 " + medicHealth[0]);
        System.out.println("Medic Health2 " + medicHealth[1]);
        System.out.println("____________");
    }
}
