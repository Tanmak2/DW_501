window.onload = function(){
    document.getElementById("add").addEventListener("click", add);

    var T_put = document.getElementsByClassName("T_put");
    for(var i in T_put){
        T_put[i].addEventListener("keyup", function(){
            if(!bt_check){
                alert("새 세팅버튼을 추가하세요");
                this.value = '';
            }
        })
    }
}

function tb(col, row, width, height){
    this.col = col;
    this.row = row;
    this.width = width;
    this.height = height;
}

var cnt = 0;
var bt_check = false;
var tb_list = new Array();

function add(){
    if(bt_check){
        alert("값을 먼저 등록해주세요")
        return;
    }
    var setbt = document.createElement("button");
    setbt.appendChild(document.createTextNode("세팅"+(++cnt)));
    setbt.setAttribute("data-value","0");
    setbt.addEventListener("click", function(){
        if(this.dataset.value == 0){
            value_save(this);
        }
        else{
            table_draw(this);
        }
    });
    document.getElementsByClassName("add_wrap")[0].appendChild(setbt);
    bt_check = true;
}

function value_save(obj){
    var input_label = ["행", "열", "너비", "높이"];
    var T_put = document.getElementsByClassName("T_put");
    for(var i in T_put){
        if(T_put[i].value == ''){
            alert(input_label[i] + "을 입력하세요");
            T_put[i].focus();
            return;
        }
    }

    bt_check=false;
    var data = new tb(T_put[0].value, T_put[1].value, T_put[2].value, T_put[3].value);
    tb_list.push(data);
    obj.dataset.value = cnt;
    for(var i=0; i<T_put.length; i++){
        T_put[i].value = '';
    }
}




function table_draw(obj){
    var div = document.getElementById("draw");
    if(div.hasChildNodes()){
        div.removeChild(div.firstChild);
    }
    var data = tb_list[parseInt(obj.dataset.value)-1];
    var table = document.createElement("table");
    table.setAttribute("border",1);
    for(var i = 0; i<data.row; i++){
        var tr = document.createElement("tr");
        tr.setAttribute("style","height:"+data.height+"px;");
        table.appendChild(tr);
        for(var j = 0; j<data.col; j++){
            var td = document.createElement("td");
            td.setAttribute("style","width:"+data.width+"px;")
            tr.appendChild(td);
        }
    }
    div.appendChild(table);
}