def solution(slice, n):
    count = n // slice
    if n % slice > 0 :
        count+=1
    return count