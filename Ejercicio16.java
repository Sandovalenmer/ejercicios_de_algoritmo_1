import java.util.*;

public class Ejercicio16{

	public static void main(String[] args){
		int num1, num2, num3, operacion;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Ingrese el primer número");
		num1 = scanner.nextInt();
		System.out.println("Ingrese un segundo número");
		num2 = scanner.nextInt();
		System.out.println("Ingrese un tercer número");
		num3 = scanner.nextInt();

		if (num1 > num2 & num1 > num3){
			System.out.println("El primer número es mayor a los otros dos");
		}

		if (num2 > num1 & num2 > num3){
			System.out.println("El segundo número es mayor a los otros dos");
		}

		if (num3 > num1 & num3 > num2){
			System.out.println("El tercer número es mayor a los otros dos");
		
		}
	}
}