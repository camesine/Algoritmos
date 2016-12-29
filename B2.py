def resp(t):
	texto = t
	
	cantidad = texto[len(texto) - 1 : len(texto)]
	numeros = texto[0 : len(texto) - 5]
	
	Matriz = numeros.split()
	
	aux = 0
	resp = ""

	aux = []
	Lista = []

	for i in range(len(Matriz)):
		aux.append(Matriz[i])
		if (i + 1) % int(cantidad) == 0:
			Lista.append(aux)
			aux = []

	
	resp = ""

	for i in Lista:
		i.reverse()
		for j in i :
			resp = resp + str(j) + " "
	
	return resp





				

sw = True
Lista = []


while sw:
	texto = input()

	if texto != "-2":
		Lista.append(resp(texto))
	else:
		sw = False


for i in Lista:
	print(i)
