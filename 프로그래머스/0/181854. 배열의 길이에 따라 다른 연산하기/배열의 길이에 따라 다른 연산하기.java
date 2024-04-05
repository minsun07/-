class Solution {
    public int[] solution(int[] arr, int n) {
        int[] answer = new int[arr.length];
        //int[] a = new int[arr.length];
        for(int i=0; i<arr.length; i++){
            answer[i] = arr[i];
            if(arr.length % 2 == 0){  //짝수
                for(int j=1; j<arr.length; j+=2){
                    answer[j] = arr[j] + n;
                }   
                
            }
            else{  //홀수
                for(int j=0; j<arr.length; j+=2)  {
                    answer[j] = arr[j] + n;
                }          
            }
        
           
        }
        return answer;
    }
}