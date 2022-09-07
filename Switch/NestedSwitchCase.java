package com.Switch;

import java.util.Scanner;

public class NestedSwitchCase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Employee ID: ");
        int empID = in.nextInt();
        String dept = in.next();

        switch (empID) {
            case 1:
                System.out.println("The employee is Kunal kushwaha");
                break;
            case 2:
                System.out.println("The employee is Kartikey Verma");
                break;
            case 3:
                System.out.println("The employee is Kalle Hallden");
                break;
            case 4:
                System.out.println("The employee ID is 4");
                switch (dept) {
                    case "SDE":
                        System.out.println("Software Developer Engineer");
                        break;
                    case "SWE":
                        System.out.println("Software Engineer");
                        break;
                    case "Management":
                        System.out.println("Product Management");
                    default:
                        System.out.println("Department not found!");
                }
                System.out.println("No match found, Enter valid credentials!");
                break;
        }
    }
}
