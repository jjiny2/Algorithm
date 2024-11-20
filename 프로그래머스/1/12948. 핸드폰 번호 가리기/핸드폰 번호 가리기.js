function solution(phone_number) {
    let num = phone_number.slice(-4);
    return num.padStart(phone_number.length, "*")
}