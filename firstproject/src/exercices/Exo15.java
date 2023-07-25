package exercices;

public class Exo15 {
    public static void main(String[] args) {
        int nombre;
        nombre = 45;

        for (int i = 1; i <= nombre; i++) {
            int sum = i;
            System.out.print(i);
            for (int j = i + 1; j <= nombre; j++) {
                if (sum + j <= nombre) {
                    sum += j;
                    System.out.print(" + " + j);
                }
            }
            if (sum == nombre) {
                System.out.println(" = " + sum);
            }
        }
    }
}
