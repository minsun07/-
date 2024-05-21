def solution(num_list):
    answer = 0
    ad=""
    od=""
    for i in num_list:
        if i%2==0:
            ad+=str(i)
        else:
            od+=str(i)
    answer = int(ad) + int(od)
    return answer
