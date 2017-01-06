texto = ""
Lista = []

while texto != "-1":
	texto = input()
	if texto != "-1":
		Lista.append(texto)

val1 = 0
amigo1 = 0
acu = 0
sw = False

for i in Lista:
	items = i.split()
	for s in items:
		for j in range(1, int(s)):
		
			if int(s) % j == 0:
				acu = acu + j
		
		if amigo1 == val1 or val1 == int(s):
			sw = True
		else:
			sw = False

		val1 = acu
		amigo1 = int(s)
		acu = 0

	if sw :
		print("SON NUMERO AMIGOS")
	else:
		print("FALLO")

