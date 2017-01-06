texto = "3 3 1 2 3 4 5 6 7 8 9 -1 2 5 8"
numeros = ""
ListaCB = []

for i in range(len(texto)):
	if texto[i:i+1] == "-":
		numeros = texto[4:i-1]
		ListaCB = (texto[int(i)+3:len(texto)]).split()
		break


filas = texto[0:1]
columnas = texto[2:3]
Lista = numeros.split()
Matriz = []

for i in range(0, int(filas)):
	Matriz.append([])
	for j in range(0, int(columnas)):
		Matriz[i].append(Lista[0])
		del Lista[0]


sw = False
aux = 0

for i in range(0, int(columnas)):
	for j in range(0, int(filas)):
		if Matriz[j][i] == ListaCB[j]:
			sw = True
			aux = i
		else:
			sw = False
			break
	if sw :
		print(aux)