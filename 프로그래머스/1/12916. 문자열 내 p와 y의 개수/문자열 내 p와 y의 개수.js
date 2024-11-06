function solution(s){
    let pc=0;
    let yc=0;
    let test=s.toUpperCase()
    for(let i=0; i<test.length; i++){
        if(test[i] === "P"){
            pc++
        }else if(test[i] === "Y"){
            yc++
        }
    }
    if(pc  === yc){
        return true
    }else if(pc != yc){
        return false
    }
}