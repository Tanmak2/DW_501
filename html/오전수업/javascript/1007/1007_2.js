var nums = [];
window.onload = function (){
    for(var i=0; i<5;){
        var ran = Math.floor(Math.random()*9)+1;
        if(nums.indexOf(ran) == -1){
            nums.push(ran);
            i++;
        }
    }
    document.getElementById("send").addEventListener("click", number_input);
}
function number_input(){
    var num1 = document.getElementById("num1").value;
    var num2 = document.getElementById("num2").value;
    var num3 = document.getElementById("num3").value;
    var num4 = document.getElementById("num4").value;
    var num5 = document.getElementById("num5").value;
    number_check(num1, num2, num3, num4, num5);
}

function number_check(num1, num2, num3, num4, num5){
    var input_nums =[parseInt(num1), parseInt(num2), parseInt(num3), parseInt(num4), parseInt(num5)];
    var check_nums = 0;
    for(var i=0; i<5; i++){
        if(nums.indexOf(input_nums[i]) != -1){
            check_nums++;
        }
    }
    number_ch(nums, input_nums);
}

function print(strike, ball){
    var res = document.getElementById("result");
    var div = document.createElement("div");
    var out = 5-strike-ball;
    div.appendChild(document.createTextNode(strike+"스트라이크"+ball+"볼"+out+"아웃"));
    res.appendChild(div);
}

function number_ch(u, input_nums){
    var strike=0, ball=0;
    if(u[0] == input_nums[0])strike++;
    if(u[1] == input_nums[1])strike++;
    if(u[2] == input_nums[2])strike++;
    if(u[3] == input_nums[3])strike++;
    if(u[4] == input_nums[4])strike++;
    if(u[0] == input_nums[1] || u[0] == input_nums[2])ball++;
    if(u[1] == input_nums[0] || u[1] == input_nums[2])ball++;
    if(u[2] == input_nums[0] || u[2] == input_nums[1])ball++;

    print(strike, ball);
}

