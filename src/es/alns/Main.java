package es.alns;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int sum = 1;
        int n;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Hasta que número quieres la lista de impares: ");
        n = entrada.nextInt();

        for(int i = 0; i <= n; i++) {
            int i = sum + (i + 1);
            System.out.println(+ sum);
        }

    }
}
