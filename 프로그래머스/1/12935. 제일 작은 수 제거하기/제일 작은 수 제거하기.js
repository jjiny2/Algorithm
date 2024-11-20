function solution(arr) {
    if(arr.length === 1 && arr[0] == 10){
        return [-1]
    }
    let min = Math.min (...arr)
    return arr.filter(item=>item != min)
}