package dayNine;

public class BackspaceStringCompare {
    public boolean backspaceCompare(String S, String T) {
        return manipulateString(S).equals(manipulateString(T));

    }
    public String manipulateString(String str) {
        StringBuilder s = new StringBuilder();
        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if((ch == '#') && (s.length() > 0))
                s.deleteCharAt(s.length() - 1);
            else if(ch != '#')
                s.append(ch);
        }
        return s.toString();
    }
}
