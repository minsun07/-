class Solution {
    public int solution(int[] arr1, int[] arr2) {
    int a=0, b=0;
    for(int i=0; i<arr1.length; i++)
        a += arr1[i];
    
    for(int i=0; i<arr2.length; i++)
        b += arr2[i];
    
        
    int answer = (arr1.length < arr2.length) ? -1 : (arr1.length > arr2.length) ? 1 : (a==b) ? 0 : (a>b) ? 1 : -1;
        
    return answer;
    }
}