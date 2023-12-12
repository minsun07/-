import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int arr[] = new int[N];
        int x = sc.nextInt();
        
        for(int i=0; i<N; i++){
            arr[i] = sc.nextInt();             
        }
        for(int j=0; j<arr.length; j++){
            if(arr[j]<x){
                System.out.print(arr[j] + " ");
            }
        }
        
       
    }
}