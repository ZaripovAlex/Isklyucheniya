/* Если необходимо, исправьте данный код
Задание 2
try {
   int d = 0;
   double catchedRes1 = intArray[8] / d;
   System.out.println("catchedRes1 = " + catchedRes1);
} catch (ArithmeticException e) {
   System.out.println("Catching exception: " + e);
}

 */


package org.example;

public class task2 {
    public static void main(String[] args) {

    }
    public static void m1(int[] intArray){
    int d = 0;
        double catchedRes1=0;
        try {
             catchedRes1 = intArray[8] / d;

        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }
        System.out.println("catchedRes1 = " + catchedRes1);
    }}

