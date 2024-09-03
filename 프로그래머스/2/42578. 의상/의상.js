function solution(clothes) {

    
const closeMap=clothes.reduce((map, [item, type])=>{
    map.set(type, (map.get(type)||0)+1)
    return map
}, new Map());
return [...closeMap.values()].reduce((count, value)=>count *=value+1, 1)-1
}
