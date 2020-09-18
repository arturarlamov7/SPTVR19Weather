/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sptvr19weather;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author user
 */
class App {
    public void run(){
        System.out.println("---- Weather ----");
        System.out.println("Задание:");
        System.out.println("Создайте зубчатый массив,");
        System.out.println("в котором хранится температура воздуха");
        System.out.println("в нашем городе  на весь год");
        System.out.println("Массив должен содержать 12 строк, количество");
        System.out.println("столбцов - количество дней в месяце.");
        System.out.println("Заполните массив случайными числами. Температура");
        System.out.println("зависит от времени года. ");
        System.out.println("Программа должна вывести на экран:");
        System.out.println("- погоду на указанную дату (месяц, день – пользователь ");
        System.out.println("  вводит данные с помощью клавиатуры) ");
        System.out.println("- в какие дни была самая теплая и самая холодная погода ");
        System.out.println("- среднюю температуру по каждому месяцу ");
        System.out.println("Решение:");
        System.out.println("Создаем, заполняем и выводим зубчатый массив с погодой.");
        int min = -30;
        int max = 30;
        int n = 0;
        Random random = new Random();
        int[][] tempInYear = new int[12][];
        //выведем строку с номерами дней месяца
        System.out.print("     ");
        for (int i = 1; i < 32; i++) {
            System.out.printf("%4d",i);
        }
        System.out.println();
        for (int i = 1; i < 32; i++) {
            System.out.print("----");
        }
        System.out.println();
        
        for (int i = 0; i < 12; i++) {
            switch (i) {
                case 0: min=-30; max=0; n=31; break;
                case 1: min=-30; max=-5; n=28; break;
                case 2: min=-20; max=5; n=31; break;
                case 3: min=-15; max=10; n=30; break;
                case 4: min=-5; max=15; n=31; break;
                case 5: min=5; max=25; n=30; break;
                case 6: min=10; max=30; n=31; break;
                case 7: min=10; max=25; n=31; break;
                case 8: min=5; max=20; n=30; break;
                case 9: min=-5; max=10; n=31; break;
                case 10: min=-10; max=0; n=30; break;
                case 11: min=-15; max=-5; n=31; break;
                
            }
            //создаем ячейки месяца
            tempInYear[i] = new int[n];
            System.out.printf("%4d) ",i+1);
            for (int j = 0; j < tempInYear[i].length; j++) {
                tempInYear[i][j]=random.nextInt(max-min+1)+min;
                System.out.printf("%4d",tempInYear[i][j]);
            }
            System.out.println();
        }
        Scanner scanner = new Scanner(System.in);
        System.out.print("Номер месяца: ");
        int month = scanner.nextInt();
        System.out.print("День месяца: ");
        int day = scanner.nextInt();
        System.out.printf("В этот день температура была %4d градусов%n", tempInYear[month-1][day-1]);
    }
}
