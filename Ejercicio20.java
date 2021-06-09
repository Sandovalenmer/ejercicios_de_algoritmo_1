import java.util.*;

public class Ejercicio20{

		public static void main(String[] args){
		
		int numero;
		int d1, d2, d4, d5;

		Scanner scanner=new Scanner(System.in);
		System.out.print(" Ingrese una cantidad numérica para determinar si es Capicúa: ");
		numero=scanner.nextInt();

		if(numero>=10000 && numero<=99999){
			String cadena=Integer.toString(numero);
			String a=cadena.substring(0,1);
			d1=Integer.valueOf(a);
			String b=cadena.substring(1,2);
			d2=Integer.valueOf(b);
			String d=cadena.substring(3,4);
			d4=Integer.valueOf(d);
			String e=cadena.substring(4,5);
			d5=Integer.valueOf(e);
			if(d1==d5 && d2==d4){
				System.out.println(" Es Capicúa ");
				} 
			else {
				System.out.println(" No es Capicúa ");
				}
		}
	}	
}