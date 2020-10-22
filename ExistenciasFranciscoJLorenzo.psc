Algoritmo sin_titulo
	Definir Existencias como Entero
	Definir Entregadas como Entero
	Existencias <- 3200
	Mientras Existencias>=100 Hacer
		Escribir "Selecciona el nº de existencias a pedir"
		Leer Entregadas
		Existencias <- Existencias-Entregadas
		Escribir "Existencias actuales: " , Existencias
	FinMientras
	Escribir "No existen existencias disponibles"
FinAlgoritmo
