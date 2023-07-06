package co.com.ps.proyecto;

import java.util.Scanner;

public class juego_adivinar {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            int numAl;
            int intentos;
            int posibilidades = 20;

            numAl = (int) (Math.random()*1000+1);
            System.out.println("Adivina el numero entre 1 y 1000 "
                    + "Tienes 20 intentos.");
            System.out.println(numAl);

            do {
                System.out.println("contador: " + posibilidades);
                System.out.print("Digite el numero que crea que es  ");
                intentos = scanner.nextInt();
                if (intentos > numAl) {
                    System.out.println("El número  es menor,  quedan "
                            + (posibilidades-1) + " intentos: ");
                } else if (intentos < numAl){
                    System.out.println("El número  es mayor, quedan "
                            + (posibilidades-1) + " intentos: ");
                } else {
                    System.out.print("¡Eso es verdadero! "+ numAl + " era el número que estbas  "
                            + "buscando, has necesitado " + (20- (posibilidades-1)) +" intentos.");
                }
                posibilidades--;
            } while (intentos != numAl && posibilidades > 0);
            if (posibilidades == 0) {
                System.out.println("No lo has encontrado. El numero  era " + numAl);
            }
        }
    }
}

}
