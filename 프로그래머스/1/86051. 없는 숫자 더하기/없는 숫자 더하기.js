function solution(numbers) {
    let total=45;
    let numberSum=numbers.reduce((a,b)=>a+b,0);
    let miss=total-numberSum
    return miss
}