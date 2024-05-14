def solution(my_string):
    answer = 0
    #방법1 : for문와 if문
    # for i in my_string:
    #     if i.isdigit():
    #         answer += int(i)
    
    #방법2 : sum함수를 활용, 한줄 작성
    answer = sum(int(i) for i in my_string if i.isdigit())
    return answer