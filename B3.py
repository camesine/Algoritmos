texto = ""
Lista = []

while texto != "-1" :
	texto = input()
	if texto != "-1":
		Lista.append(texto)


acu = 0

for i in Lista:
	for j in i:
		v = int(j)
		v = v * v * v
		acu = acu + v

	if acu == int(i):
		print("SE CUMPLE")
	else:
		print("NO SE CUMPLE")

	acu = 0

	
