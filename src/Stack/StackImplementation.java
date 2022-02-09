package Stack;

import java.util.ArrayList;

public class StackImplementation {
    public static void main(String[] args) {
        MyStack s = new MyStack();
        s.push(5);
        s.push(7);
        s.push(1);
        System.out.println(s);
        s.pop();
        System.out.println(s);
        System.out.println(s.getMin());
        s.top();

    }
    static class MyStack {
        ArrayList<Integer> s = new ArrayList<>();
        int topIndex = -1;
        ArrayList<Integer> minStack = new ArrayList<>();
        int minStackTopIndex = -1;
        int currMin = Integer.MAX_VALUE;
        public void push(int x) {
            s.add(x);
            topIndex++;
            currMin = Math.min(x,currMin);
            minStack.add(currMin);
            minStackTopIndex++;

        }

        public void pop() {
            if(topIndex != -1) {
                s.remove(topIndex);
                topIndex--;
                minStack.remove(minStackTopIndex);
                minStackTopIndex--;
            }
        }

        public int top() {
            if(topIndex == -1) return -1;
            else
               return s.get(topIndex);
        }

        public int getMin() {
            if(minStackTopIndex == -1) return -1;
            else
               return minStack.get(minStackTopIndex);
        }
    }
}
