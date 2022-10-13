window.onload = function (){
    var input = document.getElementsByClassName("movie");
    for(var i=0; i<input.length; i++){
        input[i].addEventListener("focus", function(){
            this.setAttribute("class", "movie active");
        });
        input[i].addEventListener("blur", function(){
            this.setAttribute("class", "movie");
        });
    }
}
