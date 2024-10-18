function solution(my_string) {
    let answer=my_string.split(' ')
    let first=Number(answer[0])
    
    for(let i=1; i<answer.length; i+=2){
        let operator = answer[i]
        let num = Number(answer[i+1])
        
        if(operator === '+'){
            first+=num
        }else if(operator === '-'){
            first-=num
        }
    }return first
}