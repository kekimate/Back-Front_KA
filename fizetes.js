let fizetes = {
   Anna: 2100,
   Cecil: 1890,
   Emil: 2050,
   Gerald: 2920
};

let osszFizetes = 0;
for (let nev in fizetes) {
    osszFizetes += fizetes[nev];
}

for (let nev in fizetes) {
    console.log(nev +' ' +fizetes[nev] + ' Ft-ot keres.');
}

console.log('Az összkereset: ' + osszFizetes + ' Ft.');
