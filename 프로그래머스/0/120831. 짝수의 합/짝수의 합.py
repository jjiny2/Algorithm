def solution(n):
    if n % 2 != 0: 
        n -= 1
    answer = 0
    while n > 0:
        answer += n
        n -= 2
    return answer
