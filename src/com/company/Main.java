package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int a;

        Scanner scan= new Scanner (System.in);


        System.out.println("bilangan"+"\t\trandom number");
        for(int i=1; i>=1;i++){
            int j = 1 + (int) ((Math.random()) * ((10 + 1) - 1));

                System.out.println( "\t:\t"+j);
            }
        }
    }


