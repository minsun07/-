def solution(n, numlist):
    answer = []
    a = 0
    for i in numlist:
        if i%n==0:
            answer.append(i)
    return answer