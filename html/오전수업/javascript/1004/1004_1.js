var item_list = ["핸드폰거치대", "급속충전기", "C타입케이블", "강화유리", "스마트폰 링", "스마트폰 커버"];

window.onload = function(){
    var li = document.getElementsByClassName("item");

    for (var i in li){
        li[i].innerHTML = item_list[i];
    }
}

var item = new Array();
var prices = new Array();
function enroll(){
    var name = document.getElementById("item_name");
    var price = document.getElementById("item_price");
    var pric = price.value;
    var prop = name.value;
    item.push(prop);
    prices.push(pric);

    var ul = document.getElementById("item_list");
    var li = document.createElement("li");
    li.innerHTML = item[item.length-1] + " " + prices[prices.length-1]+"원 ";
    var bt = document.createElement("button");
    bt.setAttribute("class", "del_bt");
    bt.setAttribute("onclick", "del(this)");
    bt.innerHTML = "삭제";
    li.appendChild(bt);
    ul.appendChild(li);

}

function del(obj){
    var parent_li = obj.parentNode;
    var parent_ul = parent_li.parentNode;
    parent_ul.removeChild(parent_li);
}