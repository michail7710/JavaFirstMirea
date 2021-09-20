package ru.mirea.task1.lab1;

public class lab1 {
    public static void main(String[] args) {
        //Разработайте программу, в результате работы которой считается сумма элементов целочисленного массива с помощью циклов for, while, do while, результат выводится на экран.

        int[] myArrayInt5 = {1, 3, 8, 10, 4};
        int sum = 0;
        for (int i = 0; i < myArrayInt5.length; i++) {
            sum += myArrayInt5[i];
        }
        System.out.println("Сумма чисел массива: " + sum);

        int i=0;
        sum =0;
        while ( i < myArrayInt5.length) {
            sum = sum +myArrayInt5[i];
            i++;
        }
        System.out.println("Сумма чисел массива: " + sum);
        i = 0;
        sum = 0;
        do{
             sum+=myArrayInt5[i];
            i++;
        } while (i<myArrayInt5.length);
        System.out.println("Сумма чисел массива: " + sum);

        //Разработайте программу, в результате работы которой выводятся на экран аргументы командной строки в цикле for.
    }
}
