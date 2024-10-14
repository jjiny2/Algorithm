function solution(n, t) {
    let count=1;
    let answer=n;
    while(count<=t){
        answer*=2
        count++
    }
    return answer
}