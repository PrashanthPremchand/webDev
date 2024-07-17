// Pure functions:
// 1. take some input and give same fixed output
// 2. they cause no side effects in outside world(outside the function scope)
function add(a, b) {
    console.log("Add function:", a + b);
}
add(3, 5);//op: 8
add(3, 5);//op: 8
// This add() function is a pure function. but why?
// 1. for same input 3,5 it always gives the same output
// 2. not causing any effects on the code outside the func

// Impure functions:
let c = 10;
function imAdd(d){
    console.log("Impure function add:", d + c);
}
imAdd(1);//op: 10 + 1 = 11
c = 20;
imAdd(1);//op: 20 + 1 = 21
// imAdd() is an impure function. why?
// because for same input values it gives different output
let ct = 0;
function increment(){
    console.log("Counter:", ++ct);
}
increment();// op: 1
increment();// op: 2
increment();// op: 3
// increment() is impure function. why?
// because it is changing the value of counter variable which is present out the function scope

// Function Declaration : creating a function

// function funct_name() {
    
// }
// funct_name() -> function envokation/ calling
printName();
function printName(){
    console.log("My nmae:", "Prashanth P");
}
// functions taking arguments
function printFullName(a, b) { // parameters
    return a + " " + b;
}
let name = printFullName("BathamaPriya", "RS") // arguments
console.log(`The full name is: ${name}`);

// String Interpolation( joining multiple strings)
let s1 = "Lakshara";
let s2 = "PB";
console.log(s1 + " " + s2);
console.log(`${s1} ${s2}`);

// Function Expression
// Function Expression is created when the execution reaches it and is usable only from that moment
let func = function(){
    console.log("function Expression");
}                                                            
console.log(func);
func();    

//Arrow function
// printName();
// function printName(){
//     console.log("My nmae:", "Prashanth P");
// }
let printNameArrowFunc = () =>{
    console.log("My nmae in Arrow function:", "Prashanth P");
}
printNameArrowFunc();
// let twoSum = (a, b) => {
//     return a + b;
// }
let twoSum = (a, b) => a + b;                                                                                                                                                                                               
twoSum(3, 5); //op: 8