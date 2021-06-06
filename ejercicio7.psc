Algoritmo porcentaje_aleatorio
	paresAux <- 0
	imparesAux <- 0
	cerosAux <- 0
	n <- 15
	Escribir 'Bienvenido a la ruleta, generaremos 15 numeros aleatorios'
	Escribir 'Comprendidos entre el rango (0-36)'
	Escribir 'Mostraremos el % de numeros generados : pares, impares, ceros'
	Escribir ''
	Para i<-1 Hasta n Hacer
		al <- Aleatorio(0,36)
		Escribir 'El aleatorio # ',i,' generado fue: ',al
		Escribir ''
		almod <- al MOD 2
		Si almod==0 Y al<>0 Entonces
			paresAux <- paresAux+1
		FinSi
		Si almod<>0 Entonces
			imparesAux <- imparesAux+1
		FinSi
		Si al==0 Entonces
			cerosAux <- cerosAux+1
		FinSi
	FinPara
	porcentajePares <- (paresAux/n)*100
	porcentajeImpares <- (imparesAux/n)*100
	porcentajeCeros <- (cerosAux/n)*100
	Escribir 'Los porcentajes fueron: '
	Escribir 'Numeros aleatorios Pares ',porcentajePares,' %'
	Escribir 'Numeros aleatorios Impares ',porcentajeImpares,' %'
	Escribir 'Numeros aleatorios ceros ',porcentajeCeros,' %'
FinAlgoritmo
