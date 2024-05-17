def solution(num_list):
    gob = 1
    for i in num_list:
        gob *= i        
    return 0 if gob > sum(num_list)**2 else 1