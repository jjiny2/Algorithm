function solution(dots) {
    let xline=[];
    let yline=[];
    for(let i=0; i<4; i++){
        xline.push(dots[i][0])
        yline.push(dots[i][1])
    }
    xline.sort((a,b)=>a-b)
    yline.sort((a,b)=>a-b)
    return (xline[3]-xline[0])*(yline[3]-yline[0])
}