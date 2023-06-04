//Посмотрите на код, и подумайте сколько разных типов исключений вы тут сможете получить?
/*
public static int sum2d(String[][] arr){
        int sum = 0;
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<5; j++){
                int val = Integer.parseInt(arr[i][j]);
                sum+=val;
            }
        }
        return sum;
    }
 */
package org.example;

public class task2 {
    public static void main(String[] args) {
        String[][] arr = null;
        try {
           int rez = sum2d(arr);
        }catch (NullPointerException e){
            System.out.println("NullPointerException");
        }
    }
    public static int sum2d(String[][] arr){
        int sum = 0;
        try {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < 5; j++) {
                    int val = Integer.parseInt(arr[i][j]);
                    sum += val;
                }
            }
        }catch (IndexOutOfBoundsException e){
            System.out.println("IndexOutOfBoundsException");
        }
        catch (NumberFormatException e){
            System.out.println("NumberFormatException");
        }
            return sum;
    }
}


// как то так.