
console.log(v); //hoisting
var v = 10; 
var v =20; // var can be redeclared and reinitilized 
console.log(v);

// console.log(l); //hoisted but ib TDZ(Temporal Dead Zone)
let l = 100; 
l = 200; // let can be reinitilized only, it can't be redeclared
console.log(l);


// console.log(c); //hoisted but ib TDZ(Temporal Dead Zone)
const c = 2000; // const can't be reintialized or redeclared
console.log(c); 
