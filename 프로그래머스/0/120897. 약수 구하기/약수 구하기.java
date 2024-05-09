import java.util.ArrayList;
class Solution {
    public ArrayList<Integer> solution(int n) {
         ArrayList<Integer> answerList = new ArrayList<Integer>();
    
        for(int i=1; i<=n; i++){
            if(n%i==0){
                answerList.add(i);
            }
        }
        return answerList;
    }
}