function solution(s) {
    return s.split(" ").map(
        item=>item.split("")
            .map((item,idx)=>idx%2 ===0 ? item.toUpperCase() : item.toLowerCase()
        ).join("")).join(" ")
}
