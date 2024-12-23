def solution(a, b):
    first = int('%d%d' % (a,b))
    second = 2*a*b
    
    if first > second :
        return first
    else :
        return second