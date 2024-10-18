function solution(numbers) {
    const chg = {
        'zero': '0',
        'one':'1',
        'two':'2',
        'three' : '3',
        'four' : '4',
        'five' : '5',
        'six' : '6',
        'seven' : '7',
        'eight' : '8',
        'nine' : '9'
    }
    for(let item in chg){
        numbers=numbers.replaceAll(item, chg[item])
    }
    return Number(numbers)
}