function solution(num_list) {
    let even= num_list.filter(item=>item%2===0).length
    let odd= num_list.filter(item=>item%2===1).length
    return [even, odd]
}