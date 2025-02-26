const input = require('fs').readFileSync('/dev/stdin', 'utf8');
const valor: number = parseFloat(input.trim());

const notas = [100, 50, 20, 10, 5, 2];
const moedas = [1, 0.50, 0.25, 0.10, 0.05, 0.01];

let restante: number = valor;

console.log("NOTAS:");
for (const nota of notas) {
	const qtdCedulas: number = Math.floor(restante / nota);
    console.log(`${qtdCedulas} nota(s) de R$ ${nota}.00`);
    restante %= nota;
}

console.log("MOEDAS:");
restante = parseFloat(restante.toFixed(2));

for (const moeda of moedas) {
    const qtdMoedas: number = Math.floor(restante / moeda);
    console.log(`${qtdMoedas} moeda(s) de R$ ${moeda.toFixed(2)}`);
    restante = (restante %= moeda) + 0.00001; // ajuste para arredondamento
}
