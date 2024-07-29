function solution(array, commands) {
    let answer = [];
    for(let i=0; i<commands.length; i++){
        
        let start=commands[i][0]
        let end=commands[i][1]
        let num=commands[i][2]
        
        let newArray=array.slice(start-1,end);
        
        newArray.sort((a,b)=>a-b);
        answer.push(newArray[num-1])
    }
    return answer
}