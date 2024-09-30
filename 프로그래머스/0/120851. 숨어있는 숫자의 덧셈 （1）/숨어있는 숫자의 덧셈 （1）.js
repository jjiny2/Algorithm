function solution(my_string) {
    return my_string.split('').filter((char)=>!isNaN(char)).map(Number).reduce((a,b)=>(a+b),0)
}