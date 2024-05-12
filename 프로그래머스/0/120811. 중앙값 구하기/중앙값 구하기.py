def solution(array):
    answer = 0
    array.sort()
    a = int(len(array)/2)
    answer = array[a]
    return answer