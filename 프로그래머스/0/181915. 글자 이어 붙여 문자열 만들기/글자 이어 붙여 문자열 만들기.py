def solution(my_string, index_list):
    # answer = ''
    # for i in range(0, len(index_list)):
    #     answer+=my_string[index_list[i]]
    # return answer
    
    return ''.join([my_string[i] for i in index_list])