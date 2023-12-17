import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
      
        int arr[] = new int[9];
        int max = arr[0];
        int k=0; //최댓값 위치를 담는 변수
        
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
            if(arr[i]>max){
                max = arr[i];
                k = i+1;
            }
        }      
        System.out.println(max);
        System.out.println(k);   
    }
}