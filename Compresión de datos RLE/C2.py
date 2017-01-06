x = ""
cadena = ""

while x != "-1":
	x = input()
	if x == "-1":
		break
	cadena = cadena + x

letra = cadena[0:1]
acu = 1
resp = ""


for i in range(1,len(cadena)):
	if cadena[i:i+1] == letra:
		acu = acu + 1
	else:
		resp = resp + str(acu) + letra
		letra = cadena[i:i+1]
		acu = 1



resp = resp + str(acu) + letra
print(resp) 