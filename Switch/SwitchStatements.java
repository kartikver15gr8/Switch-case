package com.Switch;

import java.util.Scanner;

public class SwitchStatements {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the fruit:");
        String fruit = in.next();
        switch (fruit) {
            case "Mango":
                System.out.println("King of fruits");
                break;
            case "Apple":
                System.out.println("An apple a day, keeps the doctor away");
                break;
            case "Banana":
                System.out.println("My favorite fruit");
                break;
            case "Kiwi":
                System.out.println("Kiwis are so nutritious");
                break;
            case "Dragon Fruit":
                System.out.println("Dragon fruits looks like dragon");
                break;
            default:
                System.out.println("Eat fruits for healthy body!!");
                break;
        }
    }
}
