Algoritmo Ejercicio20
	Definir n, c1, c2, r1, r2 como Entero
	Escribir "Ingresar Número (Máx 3 dígitos): "
	Leer n
	c1 <- (n - (n MOD 100)) / 100
	r1 <- n MOD 100
	c2 <- (r1 - (r1 MOD 10)) / 10
	r2 <- r1 MOD 10
	Si n = ((r2 * 100) + (c2 * 10) + c1) Entonces
		Escribir "Número Capícúo"
	SiNo
		Escribir "Número No Capícúo"
	FinSi
	
FinAlgoritmo
