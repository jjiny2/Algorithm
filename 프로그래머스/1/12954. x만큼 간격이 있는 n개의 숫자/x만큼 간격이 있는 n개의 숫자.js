function solution(x, n) {
    let answer=[];
    let i=1;
    while(i<=n){
        answer.push(x*i)
        i++
    }
    return answer
}