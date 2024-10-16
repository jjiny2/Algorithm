function solution(i, j, k) {
    let answer = 0;
    let kStr = k.toString();  

    for (let a = i; a <= j; a++) {
        let str = a.toString();  
        for (let char of str) {
            if (char === kStr) {
                answer++;
            }
        }
    }
    return answer;
}
