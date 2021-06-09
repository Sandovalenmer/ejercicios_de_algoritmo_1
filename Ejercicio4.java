import java.util.*;

public class Ejercicio4{

	public static void main(String[] args){
		Double num, operacion1, operacion2;
		Scanner scanner = new Scanner(System.in);
		System.out.println("\n");
		System.out.println("Ingrese un número para conocer su cuadrado y cubo");
		num = scanner.nextDouble();

		operacion1 = Math.pow(num, 2); 
		operacion2 = Math.pow(num, 3);

		System.out.println("El cuadrado del número ingresado es: "+operacion1);
		System.out.println("El cubo del número ingresado es: "+operacion2);
	}
}