class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        String as="";
        String bs="";
        as = Integer.toString(a);
        bs = Integer.toString(b);
        
        String ab="";
        String ba="";
        ab = as + bs;
        ba = bs + as;
        
        int abint = 0;
        int baint = 0;
        abint = Integer.parseInt(ab);
        baint = Integer.parseInt(ba);
        
        if(abint > baint)
            answer = abint;
        else if(abint == baint)
            answer = abint;
        else if(abint < baint)
            answer = baint;
        
        
        return answer;
    }
}