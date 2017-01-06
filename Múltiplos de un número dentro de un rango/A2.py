Lista = []
sw = True
items = []


while sw :

	Texto = input()
	
	if Texto != "0":
		Lista.append(Texto.split())
	else:
		sw = False


for x in Lista:
	resp = ""
	
	for j in range(int(x[1]), int(x[2]) + 1):
		if j % int(x[0]) == 0:
			resp = resp + str(j) + " "


	print(resp)

