def solution(arr, intervals):
    
    a1,b1 = intervals[0] #파이썬의 언패킹 기능   
    a2,b2 = intervals[1] #이미 intervals[0] = [1, 3], intervals[1] = [0, 4]
                         #이기 때문에 각 값들을 변수에 넣을 수 있다. 
    
    A = arr[a1:b1+1] #리스트 잘라서 넣기
    B = arr[a2:b2+1]
    
    return A + B  # 두 리스트 합쳐서 반환