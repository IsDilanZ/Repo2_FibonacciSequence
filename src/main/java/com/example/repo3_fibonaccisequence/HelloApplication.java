package com.example.repo3_fibonaccisequence;
import java.util.Scanner;

public class HelloApplication {
    public static void main(String[] args) {

        Scanner fibonacci = new Scanner(System.in); //Variable initialization

        System.out.println("Enter the number of terms of the Fibonacci series: ");
        int Sequence = fibonacci.nextInt();  //Declare an integer variable and save my initialized variable

        //Conditional
        if ( Sequence <= 0) {
            System.out.println("The number of terms must be greater than 0.");
        } else {
            int[] fibonacciSeries = new int[Sequence]; //Initialize an array and assign a name

            if (Sequence > 1) fibonacciSeries[1] = 1;  //Conditional


            for (int i = 2; i < Sequence; i++) {    // Make a loop
                fibonacciSeries[i] = fibonacciSeries[i - 1] + fibonacciSeries[i - 2]; //Fibonacci formula
            }

            System.out.println("Fibonacci series:");
            for (int i = 0; i < Sequence; i++) {       //Make a loop to print the results of "i"
                System.out.print(fibonacciSeries[i] + " ");
            }
        }

        fibonacci.close();
     }
    }