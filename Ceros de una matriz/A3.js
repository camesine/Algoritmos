const NumerosMatriz = "1 0 3 0 2 3"
const x = "-1"
const d = "2 3"
const Lista = NumerosMatriz.split(' ')
const Dimensiones = d.split(' ')

let Matriz = []

for(let i = 0; i < Dimensiones[0]; i++){
    Matriz.push([])
    for(let j = 0; j < Dimensiones[1]; j++){
        Matriz[i].push(Lista[0])
		Lista.shift();
    }
}


let resp = ""
let c = 0
let fila = 0

for(let i = 0; i < Matriz.length; i++){
    fila += 1
	let columna = 0
    
    for(let j = 0; j < Matriz[i].length; j++){
        columna += 1
		if (Matriz[i][j] == "0"){
            c += 1
            resp = resp + "(" + fila +"," + columna +  ") "
        }

    }

}
console.log(`${c} ${resp}`)
