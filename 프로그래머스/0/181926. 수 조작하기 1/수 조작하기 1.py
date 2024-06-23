def solution(n, control):
    
    #for문 사용
    #answer = 0
    # for i in control:
    #     if i=='w':
    #         answer += 1;
    #     elif i=='s':
    #         answer -= 1;
    #     elif i=='d':
    #         answer += 10;
    #     else:
    #         answer -= 10;
    
    #딕셔너리 사용
    answer = n
    a = {'w':1, 's':-1, 'd':10, 'a':-10}
    for i in control:
        answer += a[i]
        
    return answer