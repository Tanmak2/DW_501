function score_input(){
    var kor = 99;
    var mat = 89;
    var eng = 79;
    var tot = total(kor, mat, eng);
    var res = avg(tot);
    result_print(res);
}

function total(kor, mat, eng){
    var tot = kor+mat+eng;
    return tot;
}

function avg(tot){
    var res = tot/3;
    return res;
}

function result_print(res){
    document.write("평균 : " + res);
}