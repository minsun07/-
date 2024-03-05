#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(int n, int t) {
       
    for(int i=1; i<=t; i++){
         n*=2;  //n=n*2;
    }
    return n;
}