package com.pryjda;

public class Tree {

    public void displayTree(int level, Direction direction) {

        if (level <= 0) {
            throw new IllegalArgumentException("level of tree should be above zero");
        }

        switch (direction) {
            case UP:
                upTree(level);
                break;
            case LEFT:
                leftTree(level);
                break;
        }
    }

    private void leftTree(int level) {
        char empty = ' ';
        char star = '*';
        for (int i = 1; i <= 2 * level - 1; i++) {
            if (i <= level) {
                for (int a = 1; a <= level - i; a++) {
                    System.out.print(empty);
                }
                for (int m = 1; m <= i; m++) {
                    System.out.print(star);
                }
                System.out.println();
            }
            if (i > level) {
                for (int b = 1; b <= i - level; b++) {
                    System.out.print(empty);
                }
                for (int n = 1; n <= level - (i - level); n++) {
                    System.out.print(star);
                }
                System.out.println();
            }
        }
    }

    private void upTree(int level) {
        char empty = ' ';
        char star = '*';
        for (int i = 0; i < level; i++) {
            for (int j = 1; j <= level - i - 1; j++) {
                System.out.print(empty);
            }
            for (int k = 1; k <= 2 * i + 1; k++) {
                System.out.print(star);
            }
            System.out.println();
        }
    }

}
