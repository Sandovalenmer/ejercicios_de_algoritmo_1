import java.util.*;

public class Ejercicio8{

	public static void main(String[] args){
	int num1, num2, num3, operacion;
	Scanner scanner = new Scanner(System.in);

	System.out.println("Ingrese el primer número");
	num1 = scanner.nextInt();
	System.out.println("Ingrese el segundo número");
	num2 = scanner.nextInt();
	System.out.println("Ingrese el tercer número");
	num3 = scanner.nextInt();

	operacion = (num1+num2+num3)/(3);

	System.out.println("Ingresados los 3 números su promedio es: "+operacion);

	}
}