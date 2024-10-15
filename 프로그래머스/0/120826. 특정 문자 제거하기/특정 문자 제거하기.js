function solution(my_string, letter) {
    return my_string.split('').map(item=>item.replace(letter, '')).join('')
}