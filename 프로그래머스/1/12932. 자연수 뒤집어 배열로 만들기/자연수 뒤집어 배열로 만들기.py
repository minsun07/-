def solution(n):
    n = str(n)      # n을 문자열로 변환 : 그래야만 각 자리별로 나눌 수 있음
    n_list = list(map(int,n)) # map함수로 리스트에 있는 각 원소들을 int형으로 바꾼 후 저장
    n_list.reverse()   # 리스트를 역순으로 출력 
    return n_list
    
    #다른 사람 풀이
    #return list(map(int,reversed(str(n))))