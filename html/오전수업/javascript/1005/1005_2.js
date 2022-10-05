window.onload = function () {
    var add = document.getElementById("add");
    add.addEventListener("click", tag_add);
};

var cnt = 1;
var add_first = false;
function tag_add(){
    var div = document.getElementById("num_wrap");
    var city = document.getElementById("city").value;
    var person = document.getElementById("person").value;
    var divv = document.createElement("div");

    var h1 = document.createElement("h4");
    var h2 = document.createElement("h4");
    var h3 = document.createElement("h4");
    var nums = document.createTextNode(cnt+".");
    var citys = document.createTextNode(city);
    var persons = document.createTextNode(person+"명");
    h1.appendChild(nums);
    h2.appendChild(citys);
    h3.appendChild(persons);
    divv.appendChild(h1);
    divv.appendChild(h2);
    divv.appendChild(h3);
    if(add_first){
        var first = div.firstChild;
        div.insertBefore(divv, first);
    }
    else{
        div.appendChild(divv);
    }
    add_first = true;
    cnt++;
}