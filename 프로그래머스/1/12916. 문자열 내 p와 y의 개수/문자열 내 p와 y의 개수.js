function solution(s){
    let upper=s.toUpperCase();
    let p=0
    let y=0
    for(let i=0; i<upper.length; i++){
        if(upper[i]=='P'){
            p++
        }else if(upper[i]=='Y'){
            y++
        }
    }
    if(p == y){
        return true
    }else{
        return false
    }

    // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
    console.log(p, y)
}