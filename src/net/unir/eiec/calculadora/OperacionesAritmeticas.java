package net.unir.eiec.calculadora;

import java.util.Scanner;

public class OperacionesAritmeticas {

    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int opcion;

	do {
	    // Mostrar menú de opciones
	    System.out.println("Menu de operaciones:");
	    System.out.println("1. Sumar");
	    System.out.println("2. Restar");
	    System.out.println("3. Multiplicar");
	    System.out.println("4. Dividir");
	    System.out.println("0. Salir");

	    // Leer opción seleccionada por el usuario
	    System.out.print("Seleccione una opcion: ");
	    opcion = input.nextInt();

	    switch (opcion) {
	    case 1:
		// Sumar dos números
		double[] numeros = obtenerNumeros(input);
		sumar(numeros[0], numeros[1]);
		break;
	    case 2:
		// Restar dos números
		double[] numeros = obtenerNumeros(input);
		restar(numeros[0], numeros[1]);
		break;
	    case 3:
		// Multiplicar dos números
		double[] numeros = obtenerNumeros(input);
		multiplicar(numeros[0], numeros[1]);
		break;
	    case 4:
		// Dividir dos números
		double[] numeros = obtenerNumeros(input);
		dividir(numeros[0], numeros[1]);
		break;
	    case 0:
		// Salir del programa
		System.out.println("Saliendo del programa...");
		break;
	    default:
		// Opción inválida
		System.out.println("Opcion invalida. Intente nuevamente.");
		break;
	    }

	    System.out.println(); // Imprimir línea en blanco

	} while (opcion != 0);

	input.close(); // Cerrar scanner
    }

    // Método para obtener dos números de entrada
    public static double[] obtenerNumeros(Scanner input) {
	double[] numeros = new double[2];
	System.out.print("Ingrese el primer numero: ");
	numeros[0] = input.nextDouble();
	System.out.print("Ingrese el segundo numero: ");
	numeros[1] = input.nextDouble();
	return numeros;
    }

    // Métodos de operaciones aritméticas
    public static void sumar(double num1, double num2) {
	double resultado = num1 + num2;
	System.out.println("El resultado de la suma es: " + resultado);
    }

    public static void restar(double num1, double num2) {
		double resultado = num1 - num2;
		System.out.println("El resultado de la resta es: " + resultado);
    }

    public static void multiplicar(double num1, double num2) {
		double resultado = num1 * num2;
		System.out.println("El resultado de la multiplicacion es: " + resultado);
    }

    public static void dividir(double num1, double num2) {
		double resultado = num1 / num2;
		System.out.println("El resultado de la dividir es: " + resultado);
    }

}
