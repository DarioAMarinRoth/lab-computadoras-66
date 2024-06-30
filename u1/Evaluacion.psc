Proceso Evaluacion
	
	Definir num Como Entero;
	Definir i Como Entero;
	
	i = 1;
	Imprimir "Ingrese un numero entero positivo:";
	Leer num;
	
	Mientras num <= 0 Hacer
		Imprimir "El número debía ser positivo. Inténtelo nuevamente";
		Leer num;
	FinMientras
	
	Mientras i <= num Hacer
		Si num % i == 0 Entonces
			Imprimir i;
		FinSi
		i = i + 1;
	FinMientras
	
FinProceso
