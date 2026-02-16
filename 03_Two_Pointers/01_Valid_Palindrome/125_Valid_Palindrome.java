class Solution {
    public boolean isPalindrome(String s) {

        char[] tmp = s.toCharArray();
        StringBuilder cleaned_s = new StringBuilder();
        for (char c : tmp){
            if (Character.isLetterOrDigit(c)){
                cleaned_s.append(Character.toLowerCase(c));
            }
        }

        int mid = cleaned_s.length() / 2;
        System.out.print("mid " + mid);
        int i = 0;
        while (i < mid){
            if (cleaned_s.charAt(i) != cleaned_s.charAt(cleaned_s.length() - 1 - i)){
                return false;
            }

            i++;
        }
        return true;


}
}