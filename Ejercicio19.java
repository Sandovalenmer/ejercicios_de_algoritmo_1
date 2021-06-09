import java.util.*;

public class Ejercicio19{

	public static void main(String[] args){
		double n, div;
		Scanner scanner = new Scanner(System.in);

		n = Math.floor(Math.random()*1000)+1;

		System.out.println("El número aleatorio generado es: "+n);
		div = n%5;
		if (div==0 & n<=25) {
			System.out.println("Correcto");
		} 
		else {
			System.out.println("Incorrecto");
		}
	}
}