Algoritmo Ejercicio13
	Definir r, h, operacion Como Real
	Escribir "Ingrese el radio del cilindro"
	Leer r
	Escribir "Ingrese la altura del cilindro"
	Leer h
	
	Si r>0 Entonces
		Imprimir "El radio es positivo"
	SiNo
		Escribir "Vuelva a ingresar el radio, datos positivos"
	Fin Si
	
	si h>0 Entonces
		Imprimir "El radio es positivo"
	SiNo
		Escribir "Vuelva a ingresar la altura del cilindro, datos positivos"
	FinSi
	
	operacion=(pi)*(r^2)*(h)
	Imprimir "El volumen del cilindro es: " operacion;
	
FinAlgoritmo
