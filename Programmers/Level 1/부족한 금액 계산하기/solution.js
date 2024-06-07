// https://school.programmers.co.kr/learn/courses/30/lessons/82612
function solution(price, money, count) {
    var answer = 0;
    
    for (let i=1; i<=count; i++) {
        answer += price * i;
    }

    if (answer <= money) {
        return 0;
    } else {
        return answer - money;
    }
    
  
}
