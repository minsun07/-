class Solution {
    public long solution(long n) {
        
        double sqrt = Math.sqrt(n); //제곱근 구하기
        
        if(sqrt==(long)sqrt)
            return (long)Math.pow(sqrt+1, 2);
        return -1;
    }
}