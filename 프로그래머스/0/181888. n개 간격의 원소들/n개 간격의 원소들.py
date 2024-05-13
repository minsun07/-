def solution(num_list, n):
    answer = []
    # for i in range(0,len(num_list),n):
    #     answer.append(num_list[i])
    
    #한줄로 적어보기
    answer = num_list[::n]
    return answer