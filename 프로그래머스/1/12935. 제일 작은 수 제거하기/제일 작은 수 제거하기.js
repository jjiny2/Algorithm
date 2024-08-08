function solution(arr) {
    let min=arr[0];
    for(let i=0; i<arr.length; i++){
        if(arr[i]<min){
            min=arr[i]
        }
    }
    

    let result=arr.filter((item)=>item !== min)
    return result.length !==0 ? result : [-1]
}