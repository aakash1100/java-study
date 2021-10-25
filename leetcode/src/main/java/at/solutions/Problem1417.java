    package at.solutions;

public class Problem1417 {

    public String reformat(String s) {
        final int n = s.length();
        int a = -1, d = -1;

        char[] al = new char[n];
        char[] dg = new char[n];

        for(char c : s.toCharArray()) {
            if(c >= 'a' && c <= 'z') {
                al[++a] = c;
            } else {
                dg[++d] = c;
            }
        }

        if(Math.abs(a - d) > 1) return "";

        char[] ans = new char[n];

        int i = a > d ? 0 : 1;

        for(int j = 0; i < n && j <= a; j++, i += 2) {
            ans[i] = al[j];
        }

        i = a > d ? 1 : 0;

        for(int j = 0; i < n && j <= d; j++, i += 2) {
            ans[i] = dg[j];
        }

        return String.valueOf(ans);
    }

}
