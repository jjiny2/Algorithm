function solution(n) {
    function isComposite(num){
        let count = 0;
        for(let i=1; i<=num; i++){
            if(num%i == 0){
                count++
            }
            if(count >=3){
                return true
            }
        }
        return false
    }
    let answer=0;
    for(let i=1; i<=n; i++){
        if(isComposite(i)){
            answer++
        }
    }
    return answer
}