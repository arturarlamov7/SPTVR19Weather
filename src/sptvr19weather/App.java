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
        int min = -30;
        int max = 30;
        int n = 0;
        int array[][] = new int[12][];
        int rand;
        
        array[0] =  new int[31];
        array[1] =  new int[28];
        array[2] =  new int[31];
        array[3] =  new int[30];
        array[4] =  new int[31];
        array[5] =  new int[30];
        array[6] =  new int[31];
        array[7] =  new int[31];
        array[8] =  new int[30];
        array[9] =  new int[31];
        array[10] =  new int[30];
        array[11] =  new int[31];
        
        int sum1 = 73;
        int sum2 = 0;
        int sum3 = 0;
        int sum4 = 0;
        int sum5 = 0;
        int sum6 = 0;
        int sum7 = 0;
        int sum8 = 0;
        int sum9 = 0;
        int sum10 = 0;
        int sum11 = 0;
        int sum12 = 0;
        
        Random random = new Random();
        int[][] tempInYear = new int[12][];

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
            
            // ячейки для месяца
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
        System.out.printf("В этот день температура была: %4d градусов%n", tempInYear[month-1][day-1]);
       
        System.out.println("Средняя температура в 1 месяце была: " + sum1 / 31);
        System.out.println("Средняя температура во 2 месяце была: " + sum2 / 28);
        System.out.println("Средняя температура в 3 месяце была: " + sum3 / 31);
        System.out.println("Средняя температура в 4 месяце была: "  + sum4 / 30);
        System.out.println("Средняя температура в 5 месяце была: " + sum5 / 31);
        System.out.println("Средняя температура в 6 месяце была: " + sum6 / 30);
        System.out.println("Средняя температура в 7 месяце была:" + sum7 / 31 );
        
    }
}

