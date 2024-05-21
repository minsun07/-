def solution(num_list):
    #방법 1
    for i in num_list:
        if i<0:
            return num_list.index(i)
    return -1
    
    #방법 2
    # for i in range(len(num_list)):
    #     if num_list[i] < 0: 
    #         return i
    # return -1