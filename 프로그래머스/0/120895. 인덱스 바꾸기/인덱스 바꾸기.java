class Solution {
    public String solution(String my_string, int num1, int num2) {
       String[] sr = my_string.split("");
        String temp = sr[num1];
        sr[num1] = sr[num2];
        sr[num2] = temp;
        return String.join("",sr);
    }
}