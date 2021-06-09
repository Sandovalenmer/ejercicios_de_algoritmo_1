import java.util.*;

public class Ejercicio3{

	public static void main(String[] args) {
		int numero, operacion1, operacion2;
		Scanner scanner = new Scanner(System.in);

			System.out.println("\n");
			System.out.println("Ingrese un número enetero");
			numero = scanner.nextInt();
			System.out.println("\n");

			operacion1 = 2*numero; 
			operacion2 = 3*numero; 

			System.out.println("El doble del número ingresado es: "+operacion1);
			System.out.println("\n");
			System.out.println("El triplo del número ingresado es: "+operacion2);
		}
}


