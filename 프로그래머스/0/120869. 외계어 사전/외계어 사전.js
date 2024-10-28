function solution(spell, dic) {
    let test= spell.sort().join('');
    return dic.some(item => test === item.split('').sort().join('')) ? 1 : 2
}