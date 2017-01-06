NumerosMatriz = "3 4 2 2 3 4 5 6 7 8 9 10 11 12"
x = "-1"
f = NumerosMatriz[0:1]
c = NumerosMatriz[2:3]

NumerosMatriz = NumerosMatriz[4:len(NumerosMatriz)]

Lista = NumerosMatriz.split()

Matriz = []
for i in range(0, int(f)):
	Matriz.append([])
	for j in range(0, int(c)):
		Matriz[i].append(Lista[0])
		del Lista[0]


con = 0
columna = 0
suma = 0

for fila in Matriz:
	print(fila)

for i in range(0, int(c)):
	for j in range(0, int(f)):
		con = con + int(Matriz[j][i])
		if con > suma :
			suma = con
			columna = i
	con = 0

print(str(columna) + " " + str(suma))