package com.example.repo3_fibonaccisequence;
import java.util.Scanner;

public class HelloApplication {
    public static void main(String[] args) {

        Scanner fibonacci = new Scanner(System.in);

        System.out.println("Enter the number of terms of the Fibonacci series: ");
        int n = fibonacci.nextInt();

        if (n <= 0) {
            System.out.println("The number of terms must be greater than 0.");
        } else {
            int[] fibonacciSeries = new int[n];

            if (n > 0) fibonacciSeries[0] = 0;
            if (n > 1) fibonacciSeries[1] = 1;


            for (int i = 2; i < n; i++) {
                fibonacciSeries[i] = fibonacciSeries[i - 1] + fibonacciSeries[i - 2];
            }


            System.out.println("Fibonacci series:");
            for (int i = 0; i < n; i++) {
                System.out.print(fibonacciSeries[i] + " ");
            }
        }

        fibonacci.close();
     }
    }