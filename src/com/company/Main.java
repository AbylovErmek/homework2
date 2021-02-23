package com.company;

import java.util.Random;

public class Main {
    static int age1;
    static int temperature1;




    public static void main(String[] args) {

        showInfo(50, 20);
        showInfo(16, 30);
        showInfo(0, -2);
        showInfo(60,-10);
        showInfo(35,-21);
        generateRandomAge();

    }

    public static int showInfo(int age2, int temperature2) {
        age1 = age2;
        temperature1 = temperature2;
        if (age2 > 20 && age2 < 45 && temperature2 > -20 && temperature2 < 30) {
            System.out.println("Можно идти гулять");


        }
        if (age2 > 45){
            System.out.println("Можно идти гулять");
        }

        else {
            System.out.println("Оставайтесь дома");
        }
        return 0;
    }

    public static int generateRandomAge(){
        Random random = new Random();
        int randomAge = random.nextInt(100);
        int temperature = 10;
        System.out.println(randomAge);
        if ( randomAge > 20 && randomAge < 45) {
            System.out.println("Можно идти гулять1");


        }
        if (randomAge > 45){
            System.out.println("Можно идти гулять2");
        }
        else {
            System.out.println("Оставайтесь дома");
        }
        return randomAge;
    }
}