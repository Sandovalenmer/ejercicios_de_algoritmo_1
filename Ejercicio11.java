import java.util.*;

public class Ejercicio11{

	public static void main(String[] args){
		Double numero, A, B, C, D;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Ingrese el valor en cm que desea convertir");
		numero = scanner.nextDouble();

		A = numero*0.0109361; //yardas
		B = numero*0.01; //metros
		C = numero*0.0328084; //pies
		D = numero*0.393701; //pulgadas

		System.out.println("Del valor ingresado convetido a yardas es: "+A);
		System.out.println("A metros es: "+B);
		System.out.println("A pies es: "+C);
		System.out.println("A pulgadas es: "+D);
	}
}