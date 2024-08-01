function solution(sides) {
    let a=sides[0];
    let b=sides[1];
    let c=sides[2];
    
    let max=null;
    if(a>b && a>c){
        max=a
        if(max>=b+c){
            return 2
        }else{
            return 1
        }
    }else if(b>a && b>c){
        max=b
        if(max>=a+c){
            return 2
        }else{
            return 1
        }
    }else{
        max=c
        if(max>=a+b){
            return 2
        }else{
            return 1
        }
    }
    
}