function solution(n) {
    for(let i=0; i<=n; i++){
        if(i*i== n){
            return (i+1)*(i+1)
        }
    }
    return -1;
}