#include <stdio.h>
main(){
    int arr[9]; 
    for(int i=0; i<9; i++){
         scanf("%d", &arr[i]);      
    }
    int max = arr[0];
    int indext=1;
    for(int j=0; j<9; j++){
        if(max<arr[j]){
            max = arr[j];
            indext = j+1;
        }      
    }
     printf("%d\n", max);
     printf("%d", indext);
}