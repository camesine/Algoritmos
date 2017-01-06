import re
x = "La vaca pasta en el campo azulino"


x = re.sub("[aA]+","@", x)
x = re.sub("[eE]+", "3", x)
x = re.sub("[iI]+", "1", x)
x = re.sub("[oO]+", "X", x)
x = re.sub("[uU]+", "V", x)


print(x)