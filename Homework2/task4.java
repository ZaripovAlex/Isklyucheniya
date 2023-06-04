package org.example;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        System.out.println(checkString());
    }
    public static String checkString(){
        String rez= null;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку");
        rez = scanner.nextLine();
        if (rez.isEmpty()) {
            throw new RuntimeException("Пустую строку вводить нельзя");
    }
        return rez;
    }
}
