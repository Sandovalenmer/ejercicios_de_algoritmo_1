import java.util.*;

public class Ejercicio5{

	public static void main(String[] args){

		int numero, operacion;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Ingrese un número para conocer su posterior");
		numero = scanner.nextInt();

		operacion = numero+1;

		System.out.println("El número siguiente al ingresado es: "+operacion);

	}
}