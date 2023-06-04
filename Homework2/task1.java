/* Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
 и возвращает введенное значение.
 Ввод текста вместо числа не должно приводить к падению приложения,
  вместо этого, необходимо повторно запросить у пользователя ввод данных.*/
package org.example;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
    float rez = CheckFloat();
        System.out.println(rez);

    }

    private static float CheckFloat() {
        float rez = 0;
        boolean flag = true;
        Scanner scanner = new Scanner(System.in);
        while (flag){
            System.out.println("Введите дробь: ");
            try {
                rez =Float.parseFloat(scanner.nextLine());
                flag =false;
            }catch (RuntimeException e){
                System.out.println("Вы ввели какую то не такую дробь. :( Попробуйте еще раз! ");
            }
//            System.out.println(flag);

        }
        return rez;
    }
}