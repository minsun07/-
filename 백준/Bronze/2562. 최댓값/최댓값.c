#include <stdio.h>
 
int main(void){
    int arr[9];
    
    for(int i=0; i<9; i++){
        scanf("%d", &arr[i]);
    }
 
    int max = arr[0];
    int position = 1;
    for(int j=0; j<9; j++){
        if(arr[j] > max){
            max = arr[j];
            position = j+1;
        }
    }
 
    printf("%d\n", max);
    printf("%d\n", position);
}
