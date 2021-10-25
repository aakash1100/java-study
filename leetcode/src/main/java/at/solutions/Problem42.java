package at.solutions;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Problem42 {

    public int trap(int[] height) {
        int current = 0, ans = 0;

        Stack<Integer> stack = new Stack<>();

        while(current < height.length) {
            while(!stack.isEmpty() && height[current] > height[stack.peek()]) {
                int top = stack.pop();
                if(stack.isEmpty()) break;
                int d = current  - stack.peek() - 1;
                int bHeight = Math.min(height[current], height[stack.peek()]) - height[top];
                ans += d * bHeight;
            }
            stack.push(current++);
        }

        return ans;
    }
}
