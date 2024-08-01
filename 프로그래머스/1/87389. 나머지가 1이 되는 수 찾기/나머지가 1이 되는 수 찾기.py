def solution(n):
    a = []  #리스트 생성
    for i in range(2,n): # 2부터 n-1까지 순회
        if(n%i==1):           # n을 i로 나눴을 때 나머지가 1인 i값을
            a.append(i)       # a리스트에 저장
    return a[0]              # 큰 숫자대로 리스트에 저장 되므로
                              # 가장 작은 값을 구해야하는 조건에 따라 맨 앞 값을 출력
        
     