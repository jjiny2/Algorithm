function solution(hp) {
    let count= Math.floor(hp/5) 
    let last= hp%5 
    
    count+=Math.floor(last/3) 
    last = last%3 
    
    count +=Math.floor(last/1)
    last = last%1
    
    return count
}