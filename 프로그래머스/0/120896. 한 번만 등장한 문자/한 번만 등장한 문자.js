function solution(s) {
    let answer = [...s];
    return answer.filter(item=>s.indexOf(item)===s.lastIndexOf(item)).sort().join('');
}