import java.util.*;

public class Ejercicio15{
	public static void main(String[] args){
		int numero;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Ingrese un número");
		numero = scanner.nextInt();

		if (numero > 0){
			System.out.println("El número ingresado es positivo");
		}

		if (numero<0){
			System.out.println("El número ingresado es negativo");
		}

		if (numero == 0){
			System.out.println("El número ingresado es nulo.");
		}

	}
}