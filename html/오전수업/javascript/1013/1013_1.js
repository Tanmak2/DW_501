window.onload = function(){
    document.getElementById("bt").addEventListener("click", user_input);
};
window.addEventListener("keydown", function(event) {
    if(event.keyCode === 13){
        user_input();
    }
})

function user_input(){
    var user = document.getElementById("user");
    var user_rsp = user.value;
    var com_rsp = com_random();
    result(user_rsp, com_rsp);
    user.value = "";
    user.focus();
}

function com_random(){
    var com = Math.floor(Math.random()*3)+1;
    switch(com){
        case 1:
            com = "가위";
            break;
        case 2:
            com = "바위";
            break;
        case 3:
            com = "보";
            break;
    }
    return com;
}

function result(user, com){
    var res = document.getElementById("result");
    switch(user){
        case "가위":
            if(com == "가위"){
                res.innerHTML = "user : "+ user + " com : " + com + " 결과 : 비김";
            }
            else if(com == "바위"){
                res.innerHTML = "user : "+ user + " com : " + com + " 결과 : 컴퓨터 승";
            }
            else{
                res.innerHTML = "user : "+ user + " com : " + com + " 결과 : 유저 승";
            }
            break;
        case "바위":
            if(com == "가위"){
                res.innerHTML = "user : "+ user + " com : " + com + " 결과 : 유저 승";
            }
            else if(com == "바위"){
                res.innerHTML = "user : "+ user + " com : " + com + " 결과 : 비김";
            }
            else{
                res.innerHTML = "user : "+ user + " com : " + com + " 결과 : 컴퓨터 승";
            }
            break;
        case "보":
            if(com == "가위"){
                res.innerHTML = "user : "+ user + " com : " + com + " 결과 : 컴퓨터 승";
            }
            else if(com == "바위"){
                res.innerHTML = "user : "+ user + " com : " + com + " 결과 : 유저 승";
            }
            else{
                res.innerHTML = "user : "+ user + " com : " + com + " 결과 : 비김";
            }
            break;
    }
}