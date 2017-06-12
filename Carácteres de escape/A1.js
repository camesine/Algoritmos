const readline = require('readline');

const input = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

input.question('INPUT: ', (answer) => {
    answer = answer.replace(/\\t/g, "\t")
    answer = answer.replace(/\\n/g, "\n")
    console.log(answer)
    input.close();
});