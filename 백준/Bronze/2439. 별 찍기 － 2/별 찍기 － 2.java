import java.util.Scanner;
class Main{
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
    
        int star = sc.nextInt();
    
        for(int i=1; i<=star; i++){
            for(int j=star-1; j>=i; j--)
                System.out.print(" ");
            for(int k=1; k<=i; k++)
                System.out.print("*");
            System.out.println();
        }
    }
}