import java.util.*;

public class Ejercicio14{

	public static void main(String[] args){
		int numero1, numero2, operacion;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Ingrese el primer número");
		numero1 = scanner.nextInt();
		System.out.println("Ingrese el segundo número");
		numero2 = scanner.nextInt();

		if (numero2 / numero1 == 0){
			System.out.println("El número 2 es divisible al primer número");
		}

		else {
			System.out.println("El segundo número no es divisible al primer número");
		}
	}
}