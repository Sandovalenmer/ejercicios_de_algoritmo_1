Algoritmo Ejercicio20
	Definir n, c1, c2, r1, r2 como Entero
	Escribir "Ingresar N�mero (M�x 3 d�gitos): "
	Leer n
	c1 <- (n - (n MOD 100)) / 100
	r1 <- n MOD 100
	c2 <- (r1 - (r1 MOD 10)) / 10
	r2 <- r1 MOD 10
	Si n = ((r2 * 100) + (c2 * 10) + c1) Entonces
		Escribir "N�mero Cap�c�o"
	SiNo
		Escribir "N�mero No Cap�c�o"
	FinSi
	
FinAlgoritmo
