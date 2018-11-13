package com.pryjda;

import java.util.Scanner;

public class DisplayApp {

    public static void main(String[] args) {
        displayApp();
    }

    private static void displayApp() {

        Tree tree = new Tree();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert data for tree");
        boolean levelFactor = true;
        boolean directionFactor = true;
        int level = 0;

        while (levelFactor) {
            System.out.println("Pass number of tree levels: ");
            String levelString = scanner.nextLine();
            try {
                level = Integer.parseInt(levelString);
                levelFactor = false;
            } catch (NumberFormatException exe) {
                System.out.println("You've passed wrong number, please pass correct number \n" +
                        "it should be integer above zero");
            }
        }
        while (directionFactor) {
            System.out.println("Pass direction of tree (UP or LEFT): ");
            String directionString = scanner.nextLine();
            if (directionString.equalsIgnoreCase("UP")) {
                tree.displayTree(level, Direction.UP);
                directionFactor = false;
            } else if (directionString.equalsIgnoreCase("LEFT")) {
                tree.displayTree(level, Direction.LEFT);
                directionFactor = false;
            } else {
                System.out.println("You've passed wrong direction, please pass correct direction \n" +
                        "it should be string either UP or LEFT");
            }
        }

    }

}
