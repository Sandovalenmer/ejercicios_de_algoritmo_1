import java.util.*;

public class Ejercicio13{
	
	public static void main(String[] args){
		Double radio, altura, operacion1, operacion2, pi;
		Scanner scanner = new Scanner(System.in);


		System.out.println("Ingrese el radio del cilindro");
		radio = scanner.nextDouble();
		System.out.println("Ingrese la altura del cilindro");
		altura = scanner.nextDouble();

		pi = 3.1416;
		operacion1 = Math.pow(radio, 2);




		if (radio > 0 | altura > 0 ) {
				operacion2 = pi*operacion1*altura;
				System.out.println("El volumen del cilindro es: "+operacion2);
			
		}
		else {
			System.out.println("Los datos no son validos, vuelva a ingresarlos en datos positivos");

		}

	}
}
