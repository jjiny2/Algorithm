function solution(left, right) {
    let answer=0;
    for(let i=left; i<=right; i++){
        // i의 제곱근이 정수인 경우 약수의 개수가 홀수
        if (Number.isInteger(Math.sqrt(i))) {
            answer-=i
        }else{
            answer+=i
        }
    }
    return answer
}