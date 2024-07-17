def solution(arr):
    n = len(arr)             # arr배열의 길이
    for i in range(n):       # i를 n만큼 연속적으로 반복
        for j in range(n):   # j를 n만큼 연속적으로 반복
            if arr[i][j]!=arr[j][i]: #같이 않다면
                return 0             #0리턴
    return 1                        #같으면 1리턴