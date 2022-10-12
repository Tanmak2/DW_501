var name_list = new Array;
var job_list = new Array;

window.onload = function () {
    var add = document.getElementById("add");
    add.addEventListener("click", input);
};

function input(){
    var name = document.getElementById("name");
    var job = document.getElementById("job");
    if(name.value == "" || job.value == ""){
        alert("이름과 직업을 입력하세요");
        return;
    }
    list_push(name.value, job.value);
    name.value = "";
    job.value = "";
    name.focus();
}

function list_push(name, job){
    name_list.push(name);
    job_list.push(job);
    output_list();
}

var cnt = 0;
function output_list(){
    var output = document.getElementById("output");
    var div = document.createElement("div");
    var name = document.createElement("div");
    var job = document.createElement("div");
    var name_text = document.createTextNode(name_list[cnt]);
    var job_text = document.createTextNode(job_list[cnt]);
    name.appendChild(name_text);
    job.appendChild(job_text);
    div.setAttribute("class", "output_list");
    div.appendChild(name);
    div.appendChild(job);
    output.appendChild(div);
    cnt++;
}