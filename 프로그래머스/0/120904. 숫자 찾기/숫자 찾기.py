def solution(num, k):
    k = str(k)
    num = str(num) #'29183'
    for indx,i in enumerate(num): #enumerate():인덱스와 원소를 동시에 접근하는 함수
                                  #튜플 형태로 출력됨.indx, i로 인덱스와 원소를 각각 갖게함
        if i==k:                  #i(원소)가 k와 같다면 
            return indx+1         #indx+1리턴.(인덱스는 0부터 시작하므로) 
    else:return -1                #위 반복문과 일치하지 않다면 -1 리턴