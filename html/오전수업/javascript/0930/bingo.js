var bingo = new Array();
while (bingo.length != 25) {
  let num = Math.floor(Math.random() * 100) + 1;
  if (bingo.indexOf(num) < 0) {
    bingo.push(num);
  }
}



window.onload = function () {
  var td = document.getElementsByClassName("box");

  for (var i = 0; i < td.length; i++) {
    td[i].innerHTML = bingo[i];
    td[i].addEventListener("click", function () {
      this.style.background = "green";
      check(this.innerHTML);
    })
  }
}

function check(n) {
  // alert(n);
  // 체크한 숫자를 빙고배열에서 제외시키기
  for (let i in bingo) {
    if (bingo[i] == n) {
      bingo[i] = 0;
      break;
    }
  }

  //빙고체크
  var wd = 0, hg = 0, cr1 = 0, cr2 = 0, end = 0;
  for (var i = 0; i < 5; i++) {
    for (var k = 0; k < 5; k++) {
      if (bingo[i * 5 + k] == 0) {//줄에 0의개수체크
        wd++;
      }
      if (bingo[i + 5 * k] == 0) {
        hg++;
      }
    }
    if (bingo[i * 6] == 0) {
      cr1++;
    }
    if (bingo[i * 4 + 4] == 0) {
      cr2++;
    }
    if (wd == 5) {
      end++; //0이 5개면 빙고 
    }
    if (hg == 5) {
      end++;
    }
    if (cr1 == 5) {
      end++;
    }
    if (cr2 == 5) {
      end++;
    }
    hg = 0;
    wd = 0;// 다음줄0개수를 확인하기위해 다시 0으로 리셋
  }
  console.log(end);
  if (end == 5) {
    alert("bingo");
  }
}