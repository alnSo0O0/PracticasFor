package es.alns;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    int n;
        Scanner entrada = new Scanner(System.in);

        System.out.println ("Dame un número: ");
        n = entrada.nextInt();

        for (int i = 1; i <= n; i += 2) {
            System.out.println(i);
        }
    }
}
