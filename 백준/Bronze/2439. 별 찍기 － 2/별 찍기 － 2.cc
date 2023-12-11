#include <stdio.h>
main(){
	int star;
	scanf("%d", &star);
	
	for(int i=1; i<=star; i++){
        for(int j=star-1; j>=i; j--)
            printf(" ");
        for(int k=1; k<=i; k++)
            printf("*");
        printf("\n");
    }
}