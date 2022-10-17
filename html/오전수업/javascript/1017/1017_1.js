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

    var data = tb_list[parseInt(obj.dataset.value)-1];
    div.innerHTML = "행 : "+data.col+" 열 : "+data.row+" 너비 : "+data.width+" 높이 : "+data.height;
}