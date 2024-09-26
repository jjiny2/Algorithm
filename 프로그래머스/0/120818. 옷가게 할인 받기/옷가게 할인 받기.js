function solution(price) {
    let a=100000
    let b=300000
    let c=500000
    if(price>=c){
        return Math.floor(price*0.8)
    }else if(price>=b){
        return Math.floor(price*0.9)
    }else if(price>=a){
        return Math.floor(price*0.95)
    }else{
        return price
    }
}