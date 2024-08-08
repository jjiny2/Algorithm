function solution(x) {
    let sum=0;
    let stringx= x.toString();
    for(let i=0; i<stringx.length; i++){
        sum+=parseInt(stringx[i])
    }
    
    return x%sum == 0 ? true : false
}