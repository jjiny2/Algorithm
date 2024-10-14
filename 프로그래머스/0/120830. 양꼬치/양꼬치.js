function solution(n, k) {
    return (Math.floor(n / 10) >0) ? n*12000+ k*2000-Math.floor(n / 10)*2000 :  n*12000+ k*2000
}