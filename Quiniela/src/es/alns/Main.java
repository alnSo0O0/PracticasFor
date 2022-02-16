package es.alns;

public class Main {

    public static void main(String[] args) {

        for (int i = 1; i <= 15; i++) {
            int res = (int) Math.floor (Math.random() * 3);

            if (res != 0) {
                System.out.println("Partido " + i + ": " + res);
            }else{
                System.out.println("Partido " + i + ": x" );

            }
        }


    }
}
