class Solution {
    public int solution(int a, int b, int c) {
        int not_same = a+b+c;
        int two_same = not_same*(a*a+b*b+c*c);
        int all_same = two_same*(a*a*a+b*b*b+c*c*c);
        if(a==b&&a==c)
            return all_same;
        else if((a==b&&a!=c)||(a==c&&a!=b)||(b==c&&b!=a))
            return two_same;
        else
            return not_same;
    
        
        //다른 사람 풀이
/*        int answer = a+b+c;
        if(a==b&&b==c)             //모두 같을 경우
            return answer*(a*a+b*b+c*c)*(a*a*a+b*b*b+c*c*c);
        else if(a==b||b==c||c==a)  //두 개만 같을 경우
            return answer*(a*a+b*b+c*c);
        else                       //모두 다른 경우
            return answer;*/
    }
}