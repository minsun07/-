a, b = map(int, input().strip().split(' ')) # input() : 문자열로 "4 5"로 입력을 받는다.
                                            # strip() : 문자열의 양쪽 공백을 제거한다.
                                            # (여기서는 딱히 중요하지 않지만 안전을 위해 사용함)
                                            # split(' ') : ' ' 공백으로 분리
                                            # map(int,...) : input받은걸 int형으로 변환
print(a,'+',b,'=',a+b)