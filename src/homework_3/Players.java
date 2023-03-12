package homework_3;

import java.util.Scanner;

public class Players {
    public int userInputPlayers(int maxPlayers){
        int players = 0;

        Scanner scanner = new Scanner(System.in);
        do {
           System.out.println("Пожалуйста, введите количество игроков, от 2 до " + maxPlayers);
           if (scanner.hasNextInt()) {
                players = scanner.nextInt();
            } else {
                System.out.println("Вы ввели не число.");
                scanner = new Scanner(System.in);
            }
        } while (players < 2 || players > maxPlayers);
        return scanner.nextInt();
    }
}
