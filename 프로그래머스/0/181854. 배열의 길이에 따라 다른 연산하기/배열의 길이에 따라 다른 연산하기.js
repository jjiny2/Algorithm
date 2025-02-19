function solution(arr, n) {
    return arr.map((item, index) =>
                            arr.length % 2 === 0 
                            ? (index % 2 === 1 ? item + n : item)  
                            : (index % 2 === 0 ? item + n : item)
                            )}