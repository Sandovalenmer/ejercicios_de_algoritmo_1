import java.util.*;

public class Ejercicio10{

	public static void main(String[] args){
		int base, altura, operacion1, operacion2;
		Scanner scanner = new Scanner(System.in);

			System.out.println("Ingrese la base del rectangulo");
			base = scanner.nextInt();
			System.out.println("Ingrese la altura del rectangulo");
			altura = scanner.nextInt();

			operacion1 = (2*base)+(2*altura);
			operacion2 = base*altura;

			System.out.println(operacion1+" es el perimetro del rectangulo, y el area es: "+operacion2);

	}
}