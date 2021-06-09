import java.util.*;

public class Ejercicio12{

	public static void main(String[] args){
		Double temperatura, operacion;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Ingrese la temperatura en grado celsius.");
		temperatura = scanner.nextDouble();

		operacion = (temperatura*9/5)+32;

		System.out.println("La conversión de grados celsius a grados fahrenheit es: "+operacion);
	}
}