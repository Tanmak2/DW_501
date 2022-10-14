
function movie(title, dir, year, type){
    this.movie_title = title;
    this.movie_dir = dir;
    this.movie_year = year;
    this.movie_type = type;
}

movie.prototype.out = function(){
    return this.movie_title+" "+this.movie_dir+" "+this.movie_year+" "+this.movie_type;
}

var movie_list = new movie();


window.onload = function (){
    var input = document.getElementsByClassName("movie");
    for(var i=0; i<input.length; i++){
        input[i].addEventListener("focus", function(){
            this.setAttribute("class", "movie active");
        });
        input[i].addEventListener("blur", function(){
            if(this.value == 0){
                this.setAttribute("class", "movie");
            }            
        });
    }
}

function enroll(){
    var val_temp = document.getElementsByClassName("movie");

    var data = new movie(val_temp[0].value,val_temp[1].value,val_temp[2].value,val_temp[3].value);

    movie_list.push(data);
    print();
}

function print(){
    var li = document.createElement("li");
    li.innerText = movie_list[movie_list.length-1].out();

    document.getElementById("movie_list").append(li);
}