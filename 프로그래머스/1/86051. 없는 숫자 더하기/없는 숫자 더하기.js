function solution(numbers) {
    let sum = 0;
    let answer= 0+1+2+3+4+5+6+7+8+9
    for(let i=0; i<numbers.length; i++){
        sum+=numbers[i]
    }
    return answer-sum
}