function solution(balls, share) {
    let answer=0;
    answer=test(balls)/ (test(balls-share)*test(share));
    return Math.round(answer)
    
}
function test (n){
        let result=1;
        for(let i=2; i<=n; i++){
            result*=i
        }
        return result
    }