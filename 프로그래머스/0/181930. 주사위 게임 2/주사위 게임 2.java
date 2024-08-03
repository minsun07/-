class Solution {
    public int solution(int a, int b, int c) {
        int not_same = a+b+c;
        int two_same = not_same*(a*a+b*b+c*c);
        int all_same = two_same*(a*a*a+b*b*b+c*c*c);
        if(a==b){
            if(a==c)
                return all_same;
            else
                return two_same;
        }
        else if(a==c){
            if(a==b)
                return all_same;
            else
                return two_same;
        }
        else if(b==c){
            if(b==a)
                return all_same;
            else
                return two_same;
        }
        else
            return not_same;
    }
}