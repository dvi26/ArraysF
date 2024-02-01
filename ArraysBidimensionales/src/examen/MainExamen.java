package examen;

import java.util.Arrays;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class MainExamen {
	static Tablas tabla = new Tablas();
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int menu = 0;
		int fila;
		int columna;
		int cantidad;
		String contraseña = "Maquina2023";
		for (int i = 0; i < Tablas.cantidades.length; i++) {
			for (int j = 0; j < 4; j++) {
				Tablas.cantidades[i][j] = 5;
			}
		}
		while (menu != 4) {
			if (contraseña.equals("Maquina2023")) {

			} else {
				break;
			}
			System.out.println("1. Mostrar Golosinas");
			System.out.println("2. Pedir Golosina");
			System.out.println("3. Rellenar Golosinas");
			System.out.println("4. Apagar Máquina");
			System.out.println("Seleccione una opcion");
			menu = sc.nextInt();
			switch (menu) {
			case 1:
				Tablas.mostrarGolosinas();
				System.out.println();
				System.out.println();
				break;
			case 2:
				System.out.println("Introduzca la posicion");
				System.out.println("Fila:");
				fila = sc.nextInt();
				System.out.println("Columna:");
				columna = sc.nextInt();

				while (Tablas.validarPos(fila, columna) == false) {
					System.out.println("Posicion erronea");
					System.out.println("Introduzca la posicion");
					System.out.println("Fila:");
					fila = sc.nextInt();
					System.out.println("Columna:");
					columna = sc.nextInt();
				}
				if (Tablas.hayValorPosicion(fila, columna) == true) {
					Tablas tabla = new Tablas();
					tabla.anyadirVenta(fila, columna);
					Tablas.cantidades[fila][columna] = Tablas.cantidades[fila][columna] - 1;
					break;
				} else {
					System.out.println("No quedan existencias");
					break;
				}
			case 3:
				System.out.println("Introduzca la contraseña");
				contraseña = sc.next();
				if (contraseña.equals("Maquina2023")) {
					System.out.println("Introduzca la posicion");
					System.out.println("Fila:");
					fila = sc.nextInt();
					System.out.println("Columna:");
					columna = sc.nextInt();
					while (Tablas.validarPos(fila, columna) == false) {
						System.out.println("Posicion erronea");
						System.out.println("Introduzca la posicion");
						System.out.println("Fila:");
						fila = sc.nextInt();
						System.out.println("Columna:");
						columna = sc.nextInt();
					}
					System.out.println("Introduzca la cantidad");
					cantidad = sc.nextInt();
					Tablas.aumentarPosicion(fila, columna, cantidad);
					break;
				} else {
					System.out.println("Contraseña incorrecta");
					break;
				}
			case 4:
				tabla.imprimirVentasTotales();

			}

		}

	}

}
