function solution(array, commands) {
    let answer = [];
    for(let i=0; i<commands.length; i++){
        let start=commands[i][0];
        let j=commands[i][1];
        let k=commands[i][2];
        
        let newArray=array.slice(start-1,j).sort((a,b)=>(a-b));
        answer.push(newArray[k-1])
    }
    
    
    return answer;
}