def solution(age):
    answer = [] # answer 리스트 생성
    a = {0:'a', 1:'b', 2:'c', 3:'d', 4:'e', 5:'f', 6:'g', 7:'h', 8:'i', 9:'j'}
    #딕셔너리로 표현
    age_list = list(map(int,str(age))) # 정수 age의 각 자리숫자들을 리스트로 저장
                                       # split() 없이도 리스트로 저장됨.(23일 경우 [2, 3])
    for i in age_list:                 # 리스트 반복
        answer.append(a[i])            # answer에 키(i)에 해당되는 값(value)를 추가
    
    return ''.join(answer)             # 각 값들을 공백없이 출력