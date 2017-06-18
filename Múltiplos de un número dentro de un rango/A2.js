const input = require('readline-sync')

let Lista = []
let sw = true
items = []

while (sw) {
    const Texto = input.question('')
    if(Texto != '0') {
        Lista.push(Texto.split(' '))
    } else {
        sw = false
    }
}

Lista.forEach((row) => {
    let resp = ''
    for(let j = parseInt(row[1]); j <= parseInt(row[2]); j++) {
        if (j % parseInt(row[0]) == 0){
            resp = resp + j.toString() + ' '
        }
    }
    console.log(resp)
})