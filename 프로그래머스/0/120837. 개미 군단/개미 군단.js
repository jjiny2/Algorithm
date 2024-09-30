function solution(hp) {
    let a=Math.floor(hp/5)
    hp=hp%5
    let b=Math.floor(hp/3)
    hp=hp%3
    let c=Math.floor(hp/1)
    hp=hp%1
    return a+b+c
}