def solution(n):
    answer = [[0 for i in range(n)] for j in range(n)] #이중 배열 선언, i:열, j:행
    for i in range(n):
        for j in range(n):
            if i==j:              # i와 j가 같을 때
                answer[i][j] = 1  # 그 자리에 1 넣기
            else:                 # 아니라면
                answer[i][j] = 0  # 0 넣기
    return answer