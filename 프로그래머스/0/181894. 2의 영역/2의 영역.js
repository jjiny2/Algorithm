function solution(arr) {
    let first=-1
    let last=-1
    for(let i=0; i<arr.length; i++){
        if(arr[i]==2){
            if(first==-1){
                first=i
            }
            last=i
        }
    }
    if(first == -1){
        return [-1]
    }
    return arr.slice(first,last+1)
}