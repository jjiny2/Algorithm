function solution(my_string) {
    return my_string.replace(/./g, str=>
        str === str.toUpperCase() ? str.toLowerCase() : str.toUpperCase()
    )
}