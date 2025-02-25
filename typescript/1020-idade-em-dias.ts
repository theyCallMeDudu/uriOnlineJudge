// #1020 - Idade em dias
const input = require('fs').readFileSync('/dev/stdin', 'utf8');
const lines = input.split('\n');

const idade:number = parseInt(lines[0]);
const anos:number = Math.floor(idade / 365);
const meses:number = Math.floor((idade - (anos * 365)) / 30);
const dias:number = Math.floor((idade - (anos * 365)) % 30);

console.log(`${anos} ano(s)`);
console.log(`${meses} mes(es)`);
console.log(`${dias} dia(s)`);
