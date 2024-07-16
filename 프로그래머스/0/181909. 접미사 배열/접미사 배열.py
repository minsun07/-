def solution(my_string):
    answer = []                      # answer리스트 생성
    for i in range(len(my_string)):  # range():일정범위의 연속된 정수(my_string길이)를 반복
        answer.append(my_string[i:]) #리스트 answer에 인덱스 i자리부터 끝까지 문자열 추가
    answer.sort()                    #오름차순으로 정렬
    return answer