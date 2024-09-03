function solution(clothes) {
    const clothesMap = new Map();
    clothes.forEach(([item, type])=>{
        if(clothesMap.has(type)){
            clothesMap.set(type, clothesMap.get(type)+1)
        }else{
            clothesMap.set(type,1)
        }
    })
    let count =1;
    for(let value of clothesMap.values()){
        count *=value+1
    }
    return count-1
}