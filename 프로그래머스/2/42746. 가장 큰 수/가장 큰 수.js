function solution(numbers) {
    let answer=''
    numbers=numbers.map(num=>String(num));//String으로 변환
    
    numbers.sort((a,b)=>(b+a)-(a+b)); //정렬
    
    if(numbers[0] === '0') return'0'
    answer=numbers.join('');
    
    return answer;
}