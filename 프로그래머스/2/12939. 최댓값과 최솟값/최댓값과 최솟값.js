function solution(s) {
    let arr = s.split(" ").map(Number); 
    let min = arr[0];
    let max = arr[0];

    for (let i = 1; i < arr.length; i++) {
        if (arr[i] < min) min = arr[i];
        if (arr[i] > max) max = arr[i];
    }
    return String(min) + " " + String(max)
}