package com.company;

public class Main {

    public static void main(String[] args) {
	Days day = Days.SHARSHEMBI;

    /*switch(day) {
        case DUISHOMBU -> System.out.println("I learn Java");
        case SHEISHEMBI -> System.out.println("I learn English");
        case SHARSHEMBI -> System.out.println("I work");
        case BEISHEMBI -> System.out.println("I do sport");
        case JUMA -> System.out.println("I go to School");
        case JEISHEMBI -> System.out.println("I go to the Cinema");
        case JEKSHEMBI -> System.out.println("My Weekend day");*/

        if(day == Days.DUISHOMBU) {
            System.out.println("I learn Java");
        } else if (day == Days.SHEISHEMBI) {
            System.out.println("I learn English");
    } else if (day == Days.SHARSHEMBI) {
            System.out.println("I work");
        } else if (day == Days.BEISHEMBI) {
            System.out.println("I do sport");
        } else if (day == Days.JUMA) {
            System.out.println("I go to School");
        } else if (day == Days.JEISHEMBI) {
            System.out.println("I go to the Cinema");
        } else if (day == Days.JEKSHEMBI) {
            System.out.println("My Weekend day");
        }
    }
}
