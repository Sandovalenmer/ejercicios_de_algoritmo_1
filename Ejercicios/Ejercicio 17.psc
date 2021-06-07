Algoritmo Ejercicio17
	Definir N1, N2, N3, operacion Como Entero
	Escribir "Ingrese la base del triangulo"
	Leer N1
	Escribir "Ingrese el lado derecho del triangulo"
	Leer N2
	Escribir "Ingrese el lado izquierdo del triangulo"
	Leer N3
	
	si N1=N2 y N1=N3 Entonces
		Escribir "Es un triangulo equilatero"
	FinSi
	
	si N1>N2 y N2=N3 Entonces
		Escribir "Es un triangulo isosceles"
	SiNo
		si N2>N3 y N2=N3 Entonces
			Escribir "Es un triangulo isosceles"
			
		FinSi
	FinSi
	
	Si N1>N2 y N2>N3 Entonces
		Escribir "Es un triangulo Escaleno"
	SiNo
		si N1<N2 y N2<N3 Entonces
			Escribir "Es un triangulo Escaleno"
	
		FinSi
		
	FinSi
FinAlgoritmo
