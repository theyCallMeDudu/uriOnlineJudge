// #1018 - Cédulas
const input = require('fs').readFileSync('/dev/stdin', 'utf8');
const lines = input.split('\n');

const valor:number = parseInt(lines[0]);

const qtdCedulasCem:number = Math.floor(valor / 100);
const qtdCedulasCinquenta:number = Math.floor((valor - qtdCedulasCem * 100) / 50);
const somaValoresCemECinquenta = (qtdCedulasCem * 100) + (qtdCedulasCinquenta * 50);

const qtdCedulasVinte:number = Math.floor((valor - somaValoresCemECinquenta) / 20);
const somaValoresCemCinquentaEVinte:number = somaValoresCemECinquenta + (qtdCedulasVinte * 20);

const qtdCedulasDez:number = Math.floor((valor - somaValoresCemCinquentaEVinte) / 10);
const somaValoresCemCinquentaVinteEDez:number = somaValoresCemCinquentaEVinte + (qtdCedulasDez * 10);

const qtdCedulasCinco:number = Math.floor((valor - somaValoresCemCinquentaVinteEDez) / 5);
const somaValoresCemCinquentaVinteDezECinco:number = somaValoresCemCinquentaVinteEDez + (qtdCedulasCinco * 5);

const qtdCedulasDois:number = Math.floor((valor - somaValoresCemCinquentaVinteDezECinco) / 2);
const somaValoresCemCinquentaVinteDezCincoEDois:number = somaValoresCemCinquentaVinteDezECinco + (qtdCedulasDois * 2);

const qtdCedulasUm:number = Math.floor((valor - somaValoresCemCinquentaVinteDezCincoEDois));

console.log(valor);
console.log(`${qtdCedulasCem} nota(s) de R$ 100,00`);
console.log(`${qtdCedulasCinquenta} nota(s) de R$ 50,00`);
console.log(`${qtdCedulasVinte} nota(s) de R$ 20,00`);
console.log(`${qtdCedulasDez} nota(s) de R$ 10,00`);
console.log(`${qtdCedulasCinco} nota(s) de R$ 5,00`);
console.log(`${qtdCedulasDois} nota(s) de R$ 2,00`);
console.log(`${qtdCedulasUm} nota(s) de R$ 1,00`);
