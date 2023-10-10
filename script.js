$(document).ready(function(){
function getRandomOrder() {

/*1*/let HetNapjai = ["hétfő", "kedd", "szerda", "csütörtök", "péntek", "szombat", "vasárnap"];
/*2*/let index2 = Math.floor(Math.random() * 7);
/*3*/let newArray = [HetNapjai[index2]];
HetNapjai.splice(index2, 1);
/*4*/let index5 = Math.floor(Math.random() * 6);
/*5*/newArray.push(HetNapjai[index5]);
HetNapjai.splice(index5, 1);
/*6*/let index1 = Math.floor(Math.random() * 5);
/*7*/newArray.push(HetNapjai[index1]);
HetNapjai.splice(index1, 1);
/*8*/let index0 = Math.floor(Math.random() * 4);
/*9*/newArray.push(HetNapjai[index0]);
HetNapjai.splice(index0, 1);
/*10*/let index2_2 = Math.floor(Math.random() * 3);
/*11*/newArray.push(HetNapjai[index2_2]);
HetNapjai.splice(index2_2, 1);
/*12*/let index0_2 = Math.floor(Math.random() * 2);
/*13*/newArray.push(HetNapjai[index0_2]);
HetNapjai.splice(index0_2, 1);
/*14*/newArray.push(HetNapjai[0]);
}

console.log(getRandomOrder(["hétfő", "kedd", "szerda", "csütörtök", "péntek", "szombat", "vasárnap"]));
console.log(getRandomOrder(["h", "k", "sze", "cs", "p", "szo", "v"]));
console.log(getRandomOrder([1, 2, 3, 4, 5, 6, 7, 8, 9]));
});