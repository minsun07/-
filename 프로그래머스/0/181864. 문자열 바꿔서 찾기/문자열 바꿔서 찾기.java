class Solution {
    public int solution(String myString, String pat) {
        String str = "";
        for(int i=0; i<myString.length(); i++){
            char a = myString.charAt(i);
            str += (a=='A') ? 'B' : 'A';
        }
        
        return str.contains(pat) ? 1:0;
    }
}