package at.solutions;

import java.util.ArrayList;
import java.util.List;

public class Problem67 {

    public String addBinary(String a, String b) {
        StringBuilder sbA = new StringBuilder(a);
        StringBuilder sbB = new StringBuilder(b);

        StringBuilder ans = new StringBuilder();

        int aI = sbA.length() - 1, bI = sbB.length() - 1;
        int carry = 0;

        while(aI >= 0 || bI >= 0) {
            int aBit = aI >= 0 ? sbA.charAt(aI--) - '0' : 0;
            int bBit = bI >= 0 ? sbB.charAt(bI--) - '0' : 0;

            if(aBit == bBit) {
                ans.append(carry);
                carry = aBit;
            } else {
                ans.append(carry ^ 1);
            }
        }

        if(carry > 0) ans.append(carry);

        return ans.reverse().toString();
    }

}
