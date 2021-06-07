package base;

import java.util.Scanner;

public class app {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Please enter the number of the month:");
        String input1 = in.nextLine();
        int month= Integer.parseInt(input1);

        switch (month) {
            case 1 -> System.out.println("The name of the month is January.");
            case 2 -> System.out.println("The name of the month is February.");
            case 3 -> System.out.println("The name of the month is March.");
            case 4 -> System.out.println("The name of the month is April.");
            case 5 -> System.out.println("The name of the month is May.");
            case 6 -> System.out.println("The name of the month is June.");
            case 7 -> System.out.println("The name of the month is July.");
            case 8 -> System.out.println("The name of the month is August.");
            case 9 -> System.out.println("The name of the month is September.");
            case 10 -> System.out.println("The name of the month is October.");
            case 11 -> System.out.println("The name of the month is November.");
            case 12 -> System.out.println("The name of the month is December.");
        }




}}
