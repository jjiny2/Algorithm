function solution(num, k) {
    let numString= num.toString();
    for(let i=0; i<numString.length; i++){
        if(numString[i] == k){
            return i+1
        }
    }return -1
}