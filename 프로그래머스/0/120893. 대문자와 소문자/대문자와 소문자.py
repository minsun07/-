def solution(my_string):
    answer = ''
    for i in my_string:
        if i.isupper(): #문자가 대문자인지 확인해주는 함수
            answer += i.lower()
        else:
            answer += i.upper()
    return answer