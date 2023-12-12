#include <stdio.h>
main(){
    int N;
    scanf("%d", &N);
    int arr[N];
    int x;
    scanf("%d", &x);
    
    for(int i=0; i<N; i++){
        scanf("%d", &arr[i]);
    }
    for(int j=0; j<N; j++){
        if(arr[j]<x){
            printf("%d", arr[j]);
            printf(" ");
        }
    }
}