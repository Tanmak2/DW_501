var url = location.href;
var quests = url.split("?")[1];
var quest_nums = quests.split("=")[1];

//quest1 시작
var quest1_answer = new Array();
quest1_answer.push("i%2");
quest1_answer.push(0);
quest1_answer.push("even_sum");
quest1_answer.push("i");
quest1_answer.push("odd_sum");

var q1_out = "";

var even_sum = 0;
var odd_sum = 0;
for(var i=1; i<=100; i++){
    if(i % 2 == 0){
        even_sum += i;
    }
    else{
        odd_sum += i;
    }
}
q1_out += "짝수의 합은 : "+even_sum+"<br>";
q1_out += "홀수의 합은 : "+odd_sum;
//quest1 종료

//quest2 시작
var quest2_answer = new Array();
quest2_answer.push(2);
quest2_answer.push(9);
quest2_answer.push(1);
quest2_answer.push(9);
quest2_answer.push("i*j");
var q2_out = "";

for(var i=2; i<=9; i++){
    for(var j=1; j<=9; j++){
        q2_out += i + " * " + j + " = " + i*j +"<br>";
    }
}
//quest2 종료

//quest3 시작
var quest3_answer = new Array();
quest3_answer.push("DW_501.length");
quest3_answer.push("DW_501[i]");
var q3_out = "";
var dw_501 = ["윤재영", "김재영", "최재영", "박재영"];

for(var i=0; i<dw_501.length; i++){
    q3_out += dw_501[i]+"<br>";
}


//quest3 종료

//quest4 시작
var quest4_answer = new Array();
quest4_answer.push("x+y");
quest4_answer.push(60);
quest4_answer.push("b");

var q4_out = "80";


//quest4 종료

//quest5 시작
var quest5_answer = new Array();
quest5_answer.push(1000);
quest5_answer.push('"떡볶이"');
quest5_answer.push("'떡볶이'");

var q5_out = "1000<br>분식";

//quest5 종료

//문제 선택 시작
window.onload = function (){
    switch(parseInt(quest_nums)){
        case 1:
            document.getElementById("quest1_result").innerHTML = q1_out;
            break;
        case 2:
            document.getElementById("quest2_result").innerHTML = q2_out;
            break;
        case 3:
            document.getElementById("quest3_result").innerHTML = q3_out;
            break;
        case 4:
            document.getElementById("quest4_result").innerHTML = q4_out;
            break;
        case 5:
            document.getElementById("quest5_result").innerHTML = q5_out;
            break;
    }
}
//문제 선택 종료

//정답확인 버튼 메소드 시작
function answer_result(quest){
    switch(quest){
        case 1:
            var q1 = document.getElementById("quest1_1").value;
            var q2 = document.getElementById("quest1_2").value;
            var q3 = document.getElementById("quest1_3").value;
            var q4 = document.getElementById("quest1_4").value;
            var q5 = document.getElementById("quest1_5").value;
            var q6 = document.getElementById("quest1_6").value;
            if(q1 == quest1_answer[0] && q2 == quest1_answer[1] && q3 == quest1_answer[2] && q4 == quest1_answer[3] && q5 == quest1_answer[4] && q6 == quest1_answer[3]){
                alert("정답입니다! 다음 문제를 풀어주세요!");
                location.replace("index.html");
            }
            else{
                alert("오답입니다. 다시 입력해주세요");
            }
            break;
        case 2:
            var q1 = document.getElementById("quest2_1").value;
            var q2 = document.getElementById("quest2_2").value;
            var q3 = document.getElementById("quest2_3").value;
            var q4 = document.getElementById("quest2_4").value;
            var q5 = document.getElementById("quest2_5").value;
            if(quest2_answer[0] == q1 && quest2_answer[1] == q2 && quest2_answer[2] == q3 && quest2_answer[3] == q4 && quest2_answer[4] == q5){
                alert("정답입니다! 다음 문제를 풀어주세요!");
                location.replace("index.html");
            }
            else{
                alert("오답입니다. 다시 입력해주세요");
            }
            break;
        case 3:
            var q1 = document.getElementById("quest3_1").value;
            var q2 = document.getElementById("quest3_2").value;
            if(q1 == quest3_answer[0] && q2 == quest3_answer[1]){
                alert("정답입니다! 다음 문제를 풀어주세요!");
                location.replace("index.html");
            }
            else{
                alert("오답입니다. 다시 입력해주세요");
            }
            break;
        case 4:
            var q1 = document.getElementById("quest4_1").value;
            var q2 = document.getElementById("quest4_2").value;
            var q3 = document.getElementById("quest4_3").value;
            if(q1 == quest4_answer[0] && q2 == quest4_answer[1] && q3 == quest4_answer[2]){
                alert("정답입니다! 다음 문제를 풀어주세요!");
                location.replace("index.html");
            }
            else{
                alert("오답입니다. 다시 입력해주세요");
            }
            break;
        case 5:
            var q1 = document.getElementById("quest5_1").value;
            var q2 = document.getElementById("quest5_2").value;
            if(q1 == quest5_answer[0] && (q2 == quest5_answer[1] || q2 == quest5_answer[2])){
                alert("정답입니다! 다음 문제를 풀어주세요!");
                location.replace("index.html");
            }
            else{
                alert("오답입니다. 다시 입력해주세요");
            }
            break;
    }
}
//정답확인 버튼 메소드 종료