class Solution {
    public int solution(String myString, String pat) {
         String str = "";
        for(int i=0; i<myString.length(); i++){
            char a = myString.charAt(i);
            str += (a=='A') ? 'B' : 'A'; //삼항연산자로 간단하게 만들기
        }
        
        return str.contains(pat) ? 1:0;
    }
}