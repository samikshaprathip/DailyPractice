class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer> stack = new ArrayDeque<>();

        for(String token : tokens){
            if("+-*/".contains(token)){
            int a = stack.pop();
            int b = stack.pop();
            switch(token){
                case "+": stack.push(b+a); break;
                case "-": stack.push(b-a); break;
                case "*": stack.push(b*a); break;
                case "/": stack.push(b/a); break;
            }
            }else{
                stack.push(Integer.parseInt(token));
            }
        }
        return stack.pop();
    }
}