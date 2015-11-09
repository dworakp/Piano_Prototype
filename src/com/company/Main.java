package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        Dzwiek X;
        X = new Dzwiek(i);
        X.play();
    }
}
