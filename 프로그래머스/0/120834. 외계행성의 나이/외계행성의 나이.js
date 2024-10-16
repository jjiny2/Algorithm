function solution(age) {
    const exchage={
        0:'a',
        1:'b',
        2:'c',
        3:'d',
        4:'e',
        5:'f',
        6:'g',
        7:'h',
        8:'i',
        9:'j',
    }
    let num=age.toString();
    let result =''
    
    for(let i=0; i<num.length; i++){
        result += exchage[num[i]]
    }
    return result
}