package codeSignal.arcade;

public class Id_3_CheckPalindrome {
    public boolean solution(String inputString) {
        String reverse = "";
        for (int i = inputString.length() - 1; i >= 0; i--) {
            reverse += inputString.charAt(i);
        }
        if (reverse.equals(inputString)) return true;
        else return false;
    }
}