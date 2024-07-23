def solution(myString):
    # i로 myString를 순회
    # (if문) i가 l보다 크면 i의 값을 출력
    # 아니라면 l로 출력
    a = [ i if i > 'l' else 'l' for i in myString] 
    answer = ''.join(a)      # 공백 없이 리스트 합치기
    return answer 