function solution(box, n) {
    let width= box[0]
    let height= box[1]
    let length= box[2]
    
    return Math.floor(width/n)*Math.floor(height/n)* Math.floor(length / n);
}