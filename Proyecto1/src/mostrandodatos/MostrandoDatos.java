package mostrandodatos;

import java.util.Scanner;

public class MostrandoDatos {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		
System.out.println("Introduce nombre: ");
String nombre = entrada.nextLine();
System.out.println("Introduce el primer apellido: ");
String apellido1 = entrada.nextLine();
System.out.println("Introduce el segundo apellido:  ");
String apellido2 = entrada.nextLine();



	entrada.close();
	}

}
