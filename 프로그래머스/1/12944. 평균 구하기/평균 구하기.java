class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        double sum = 0;
        for(int i=0; i<arr.length; i++){ //배열 원소의 전체 합 구하기
            sum += arr[i];
        }
        answer = sum/arr.length;        //평균 구하기
        return answer;
    }
}