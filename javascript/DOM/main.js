// 1. selecting elements in document
// getElementById(): gets element with the id that you pass as parameter
let title = document.getElementById("title");
title.innerText = "Changed by DOM";

// querySelector() : gets the first element with the specified selector
let list1 = document.querySelector("li");
list1.innerText = "DOM item 1";
list1.style.border = "1px solid blue";

// querySelectorAll(): gets all the elements with the specified selector
let lists = document.querySelectorAll("ul > li"); //here tag, class and IDs can be used
for(let i = 0; i < lists.length; i++) {
    lists[i].innerText = "DOM items";
}

// 2. adding new elements to document
// createElement() : to add new elements to the DOM tree
// let divEle = document.getElementsByTagName("div")[1]; //in this html document there are two div elements so to select the required div element we use index 0, 1 for the respective divs
let orderedList = document.createElement("ol");
document.body.appendChild(orderedList);
let li1 = document.createElement("li");
li1.innerText = "DOM created element 1";
orderedList.appendChild(li1);
let li2 = document.createElement("li");
li2.innerText = "DOM created element 2";
orderedList.appendChild(li2);
