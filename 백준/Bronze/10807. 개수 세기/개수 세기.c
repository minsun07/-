#include <stdio.h>
main(){
    int N;
    scanf("%d", &N);
    int arr[N];
    int count = 0;
    
    for(int i=0; i<N; i++){
        scanf("%d", &arr[i]);
    }
    int v;
    scanf("%d", &v);
    
    for(int j=0; j<N; j++){
        if(v == arr[j]){
            count++;
        }
    }
    printf("%d", count);
}