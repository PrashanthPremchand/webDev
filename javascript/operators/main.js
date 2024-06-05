let a = 10;
console.log(a++);// a = 10
console.log(a);//a = 11
console.log(--a);//a = 10
let st1 = 20 + "abc";
console.log(typeof st1 + " " + st1);
let st2 = true + "abc";
console.log(typeof st2 + " " + st2);
let nu = true + 20;
console.log(typeof nu + " " + nu);
let nu2 = true - false;
console.log(typeof nu2 + " " + nu2);
let bo = true;
console.log(typeof bo + " " + bo);
console.log(2 == 2);
console.log(2 != 2);
console.log(2 == 3);
console.log("abc" == "abc"); //true
console.log("abc" == "Abc"); //false
console.log(10 < 11);
console.log("10" < "11"); //true
console.log("a" > "A"); //true
console.log("10" == 2); //false
console.log("10" == 10); //true
console.log("10" === 10); //false
console.log("ten" == 10); // false
console.log(1 == true); //true
console.log(0 == false); //true
console.log(Boolean (0));
console.log(Boolean (1));
console.log(Boolean(-1));
console.log(Boolean(0, 0));
console.log(Boolean(""));
console.log(Boolean(" "));
console.log(Boolean("b"));
console.log(Boolean("1"));
console.log(Boolean(undefined));
let u1;
console.log(u1);
console.log("a" / 10);
console.log("a" / "b");                                                                                                                                                                                                                                 
console.log(100 > "a");
console.log("a" > "b");
console.log(NaN == NaN); //is false becuse these NaN can be from two different operation which need not be same eg: (100 / "a") = NaN and ("b" + 10) = NaN
console.log(String(2)); //not working!
console.log(String(true));//not working!
console.log(String(undefined));//not working!
console.log(String(NaN));//not working!
console.log(typeof [1, 2, 3]);//object
console.log(Number("10"));
console.log(Number("a"));
console.log(Number(undefined));
console.log(true && 10);
console.log(true && "10");
console.log(true && undefined);
console.log(true && NaN);
console.log("" && 10);  
console.log(undefined && 10);
console.log(NaN && 10);
console.log(true || 10);
console.log(1 || 10);
console.log("a" || 1);
console.log(false || 1);
console.log("" || 10);
console.log(0 || 100);
console.log(false || undefined);
console.log(false || null);
console.log(false || NaN);
console.log(false || false);
console.log(!false);
console.log(!"");
console.log(!0);
console.log(!true);
console.log(!"a");
console.log(!-1);