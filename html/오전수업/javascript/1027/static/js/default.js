$(document).ready(function(){
    $(".menu-toggle").on("click",function(){
        $(".gnb").stop().slideToggle("fast");
    });
});