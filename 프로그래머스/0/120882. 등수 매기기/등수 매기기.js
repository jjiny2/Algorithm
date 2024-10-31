function solution(score) {
    let avg=score.map(item=>(item[0]+item[1])/2);
    let answer=[...avg].sort((a,b)=>(b-a));
    return avg.map(item=>answer.indexOf(item)+1)
}