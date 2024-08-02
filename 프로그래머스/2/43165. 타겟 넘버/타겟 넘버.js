function solution(numbers, target) {
    let count = 0;
    function dfs(idx, current){
        if(idx==numbers.length){
            if(current==target){
                count++
            }
            return
        }       
        dfs(idx+1, current+numbers[idx])
        dfs(idx+1, current-numbers[idx])
    }
    dfs(0,0)
    return count
}