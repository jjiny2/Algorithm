function solution(array, n) {
    array.push(n)
    array.sort((a,b)=>a-b); //3 10 20 28
    let test= array.indexOf(n)
    if(test === 0) return array[test+1]
    if(test === array.length-1){
        return array[test-1]
    }
    
    if((Math.abs(array[test]-array[test-1]))>(Math.abs(array[test]-array[test+1]))){
        return array[test+1]
    }else{
        return array[test-1]
    }
}