function solution(my_string) {
    return my_string.split('').filter(item=>!isNaN(item) && item != ' ').map(Number).sort()
}