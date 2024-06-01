class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        String str = "";
        for(int i=0; i<myString.length(); i++){
            char a = myString.charAt(i);
            if(a=='A')
                str += 'B';
            else
                str += 'A';
        }
        
        return str.contains(pat) ? 1:0;
    }
}