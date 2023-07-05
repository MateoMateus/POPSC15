package co.com.ps.c4;

import javax.swing.*;
import java.util.Scanner;

public class Nota {

    public static void (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite su nombre: ");
        String nombre = scanner.nextLine();

        System.out.println("Digite nota del estudiante: ");
        int nota = scanner.nextInt();

        if (nota >= 3 && nota <= 5) {
            System.out.println("El estudiante aprobo la materia");

        } else if (nota <= 3.1 && nota >= 0) {
            System.out.println("El estudiante reprobo la materia ");

        } else
            System.out.println("Revise la nota del estudiante");


    }
}


