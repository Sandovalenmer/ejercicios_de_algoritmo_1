import java.util.*;

public class Ejercicio17{
	
	public static void main(String[] args){
		int lado1, lado2, lado3;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Ingrese el primer lado");
		lado1 = scanner.nextInt();
		System.out.println("Ingrese el segundi lado");
		lado2 = scanner.nextInt();
		System.out.println("Ingrese el tercer lado");
		lado3 = scanner.nextInt();

		if (lado1 == lado2 & lado2 == lado3){
			System.out.println("Es un triangulo equilatero");
		}

		if (lado1 == lado2 & lado2 > lado3){
			System.out.println("Es un triangulo isosceles");
		}
		if (lado1 > lado2 & lado2 == lado3) {
			System.out.println("Es un triangulo isosceles");

		}
		if (lado1 > lado2 & lado2 > lado3){
			System.out.println("Es un triangulo escaleno");

		}
		if (lado1 < lado2 & lado2 < lado3) {
			System.out.println("Es un triangulo escaleno");
		}

	}
}