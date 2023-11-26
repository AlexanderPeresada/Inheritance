package Inheritance;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть ставку: ");
        double bet = scanner.nextDouble();

        GameVariable gameVariable = new GameVariable();
        double wining = gameVariable.calculateWinning(bet);

        System.out.println("Виграш " + wining);


    }
}
