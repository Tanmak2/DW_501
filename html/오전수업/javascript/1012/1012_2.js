window.onload = function(){
    document.getElementById("bt").addEventListener("click", input);
}

function input(){
    var birth = document.getElementById("birth");
    var regex = /\d{4}.\d{2}.\d{2}/;
    var reif = birth.value.split(".");
    if(birth.value == "" || !regex.test(birth.value) || reif[1] > 12 || reif[1] < 1 || reif[2] > 31 || reif[2] < 1){
        alert("입력값이 비어있거나, 데이터포맷이 다릅니다.");
        return;
    }
    var output = document.getElementById("birthday");
    var ul = document.createElement("ul");
    var li1 = document.createElement("li");
    var li2 = document.createElement("li");
    var li3 = document.createElement("li");
    var li1_text = document.createTextNode("태어난 년도 : " + getYear(birth.value)+"년");
    var li2_text = document.createTextNode("태어난 월 : "+getMonth(birth.value)+"월");
    var li3_text = document.createTextNode("나이 : "+getAge(getYear(birth.value)));
    li1.appendChild(li1_text);
    li2.appendChild(li2_text);
    li3.appendChild(li3_text);
    ul.appendChild(li1);
    ul.appendChild(li2);
    ul.appendChild(li3);
    output.appendChild(ul);
    birth.value = "";
    birth.focus();
}

function getYear(birth){
    var year = birth.split(".")[0];
    return year;
}

function getMonth(birth){
    var month = parseInt(birth.split(".")[1]);
    return month;
}

function getAge(birth){
    var age = 2022 - birth + 1;
    return age;
}