function solution(brown, yellow) {
    let height=1;
    while((brown-height*2)/2-2 !== yellow/height) height++;
    return[yellow/height+2,height+2];
}

