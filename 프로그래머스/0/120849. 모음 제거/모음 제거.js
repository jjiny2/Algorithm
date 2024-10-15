function solution(my_string) {
    let remove=['a','e','i','o','u'];
    return my_string.split('').filter(item=>!remove.includes(item)).join('')
}