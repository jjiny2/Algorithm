function solution(s) {
    if(s.length === 4 || s.length === 6){
        return (/^\d+$/.test(s)) ? true : false
    }else{
        return false
    }
}