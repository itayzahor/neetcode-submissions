class Solution {
    public boolean isPalindrome(String s) {
        int start = 0, end = s.length() - 1;
        while (start < end) {
            char cs =s.charAt(start), ce = s.charAt(end);
            // check if the characters are alphanumeric
            if (Character.isLetterOrDigit(cs) && Character.isLetterOrDigit(ce)) {
                cs = Character.toLowerCase(cs);
                ce = Character.toLowerCase(ce);
                if (cs != ce) return false;
                start++;
                end --;
            } else if (!Character.isLetterOrDigit(cs) && Character.isLetterOrDigit(ce)) {
                start++;
            } else if (Character.isLetterOrDigit(cs) && !Character.isLetterOrDigit(ce)) {
                end--;
            } else {
                start ++;
                end--;
            }
        }
        return true;
    }
}
