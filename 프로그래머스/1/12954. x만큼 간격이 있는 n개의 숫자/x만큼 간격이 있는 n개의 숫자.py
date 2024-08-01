def solution(x, n):
    answer = []
    if x>0:                          # x가 0보다 클 경우
        for i in range(x, x*n+1, x): # x부터 시작해서 x*n+1까지 x만큼 순회
            answer.append(i)         # 리스트에 저장
    elif x<0:                        # x가 0보다 작을 경우
        for i in range(x, x*n-1, x): # x부터 x*n-1까지 x만큼 순회
            answer.append(i)         # 리스트에 저장
    else:                            # n이 0일 경우
        answer = [0]*n
  
    return answer
