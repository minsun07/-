def solution(binomial):
    
    #내 방법
    a = binomial.split(" ")
    i_n1 = int(a[0])
    i_n2 = int(a[2])
    
    if a[1]=='+':
        return i_n1 + i_n2
    elif a[1]=='-':
        return i_n1 - i_n2
    else:
        return i_n1 * i_n2

     #다른 사람 코드
#     a,op,b = binomial.split()
#     a = int(a)
#     b = int(b)
#     if op == '+':
#         return a+b
#     elif op == '-':
#         return a-b
#     else:
#         return a*b
    