package br.edu.univas;

public class StartApp {

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        int i = 1;
        System.out.println("\n\n\n*******\n\n\n");
        for (; i <= 10; i++) {
            System.out.println(i);
        }

        System.out.println("\n\n\n*******\n\n\n");
        for (i = 1; i <= 10;) {
            System.out.println(i);
            i++;
        }

        System.out.println("\n\n\n*******\n\n\n");
        for (i = 1; ; i++) {
            System.out.println(i);
            if (i == 10) {
                break;
            }
        }

        System.out.println("\n\n\n*******\n\n\n");
        i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }

        System.out.println("\n\n\n*******\n\n\n");
        i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i <= 10);

        System.out.println("\n\n\n*******\n\n\n");
        int j = 10;
        while (true) {
            System.out.println(j);
            j--;
            if (j == 0) {
                break;
            }
        }

        System.out.println("\n\n\n*******\n\n\n");
        for (int m = 1; m < 50; m++) {
            if (m % 2 == 0) {
                continue;
            }
            System.out.println(m);
        }
    }

}
