#include <stdio.h>
main(){
    
    int N;
    scanf("%d", &N);
    int arr[N];
    for(int i=0; i<N; i++){
        scanf("%d", &arr[i]);
    }
    int min=arr[0], max=arr[0];
    for(int j=0; j<N; j++){
        if(min>arr[j])
            min = arr[j];
        else if(max<arr[j])
            max = arr[j];
    }
    printf("%d", min);
    printf(" ");
    printf("%d", max);
}