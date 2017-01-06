Lista = []
texto = ""
while texto != "-1":
	texto = input()
	if texto != "-1":
		Lista.append(texto)


for i in Lista:
	c = 0
	for j in i:
		c = c + int(j)

	print(c)