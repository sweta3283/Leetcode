class Solution {
    public String removeStars(String s) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '*') {
                 if(sb.length() > 0){
                    sb.setLength(sb.length()-1);
                }
            } else {
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}