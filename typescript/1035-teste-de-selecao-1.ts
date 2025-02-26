const input = require('fs').readFileSync('/dev/stdin', 'utf8');
const linhas = input.trim().split(/\s+/).map(Number);

const [A, B, C, D] = linhas;

if ( (B > C) &&
    (D > A) &&
    ( (C + D) > (A + B) ) &&
    C > 0 &&
    D > 0 &&
    A % 2 === 0) {
        console.log("Valores aceitos");
    } else {
        console.log("Valores nao aceitos");
    }
