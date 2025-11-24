package sumando;

import java.util.Scanner;

public class Sumando {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce dos numeros: ");
		int num1 = entrada.nextInt();
		int num2 = entrada.nextInt();
		
		int suma = num1 + num2;
		
		System.out.println("La suma de ambos es de " + suma);
		
	
		entrada.close();
	}

}
