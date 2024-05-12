def solution(money):
    answer = [0,0]
    a = int(money/5500)
    answer[0] = a
    answer[1] = money - (5500*a)
    return answer