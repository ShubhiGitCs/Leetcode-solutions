class Solution {
    public boolean repeatedSubstringPattern(String s) {
        StringBuilder str = new StringBuilder();

        for (int i = 0; i < s.length() / 2; i++) {
            str.append(s.charAt(i));
            if (s.endsWith(str.toString())) if (s.split(str.toString()).length == 0) return true;
        }

        return false;
    }
}
        
  