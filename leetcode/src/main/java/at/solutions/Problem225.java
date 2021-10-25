package at.solutions;

import java.util.LinkedList;
import java.util.Queue;

public class Problem225 {

    static class MyStack {

        private Queue<Integer> q;

        public MyStack() {
            q = new LinkedList<>();
        }

        public void push(int x) {
            q.offer(x);
        }

        public int pop() {
            if(empty()) return -1;
            rotate();
            return q.poll();
        }

        public int top() {
            rotate();
            int top = q.poll();
            q.offer(top);
            return top;
        }

        public boolean empty() {
            return q.isEmpty();
        }

        private void rotate() {
            int pollAndMoveToLast = q.size() - 1;
            for(int i = 0; i < pollAndMoveToLast; i++) {
                q.offer(q.poll());
            }
        }
    }
}
