window.onload = function () {
    var add = document.getElementById("add");
    add.addEventListener("click", tag_add);
};

var add_check = false;

function tag_add(){
    if(add_check){
        return;
    }
    add_check = true;
    var div = document.getElementById("score_wrap");
    var ipt = document.createElement("input");
    ipt.setAttribute("type", "text");
    ipt.setAttribute("id", "name");
    ipt.setAttribute("placeholder", "이름");
    div.appendChild(ipt);

    var course = [["국어","kor"],["수학","mat"],["영어","eng"]];
    for(let i = 0; i < 3; i++){
        ipt = document.createElement("input");
        ipt.setAttribute("type", "number");
        ipt.setAttribute("id", course[i][1]);
        ipt.setAttribute("placeholder", course[i][0]);
        div.appendChild(ipt);
    }
    var bt = document.createElement("button");
    bt.addEventListener("click", enroll);
    var text = document.createTextNode("등록");
    bt.appendChild(text);
    div.appendChild(bt);
}


function enroll(){
    add_check = false;
    var name = document.getElementById("name").value;
    var kor = document.getElementById("kor").value;
    var mat = document.getElementById("mat").value;
    var eng = document.getElementById("eng").value;

    var Pdiv = document.getElementById("score_wrap");

    var div = document.createElement("div");
    var data = [name, kor, mat, eng];
    for(let i in data){
        let h = document.createElement("h3");
        let text = document.createTextNode(data[i]);
        h.appendChild(text);
        div.appendChild(h);
    }
    var input = Pdiv.lastChild;
    Pdiv.removeChild(input);
    Pdiv.appendChild(div);
}