function solution(array) {
    array.sort((a,b)=>a-b)
    let test=Math.floor(array.length/2)
    return array[test]
}