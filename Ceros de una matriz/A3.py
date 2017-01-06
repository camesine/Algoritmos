NumerosMatriz = "1 0 3 0 2 3"
x = "-1"
d = "2 3"
Lista = NumerosMatriz.split()
Dimensiones = d.split()

Matriz = []

for i in range(0, int(Dimensiones[0])):
	Matriz.append([])
	
	for j in range(0, int(Dimensiones[1])):
		Matriz[i].append(Lista[0])
		del Lista[0]

resp = ""
c = 0
fila = 0

for i in Matriz:
	fila += 1
	columna = 0
	for j in i:
		columna += 1 
		if j == "0":
			c += 1
		
			resp = resp + "(" + str(fila) +"," + str(columna) +  ") "

print(str(c) + " " + resp)
