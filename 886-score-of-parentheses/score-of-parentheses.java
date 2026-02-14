class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        stack.push(0); 
        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                stack.push(0); 
            } else {
                int inner = stack.pop();
                int prev = stack.pop();
                int add = (inner == 0) ? 1 : 2 * inner;
                stack.push(prev + add);
            }
        }
        return stack.pop();
    }
}
