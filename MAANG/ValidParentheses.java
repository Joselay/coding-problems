class Solution {
    boolean compare(char a, char b) {
        return (a == '(' && b == ')' ||
                a == '{' && b == '}' ||
                a == '[' && b == ']');
    }
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<Character>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '(' || s.charAt(i) =='[' || s.charAt(i) =='{')
                stack.push(s.charAt(i));
            else{
                if(stack.isEmpty())
                    return false;
                else if(!compare(stack.peek(),s.charAt(i)))
                    return false;
                else
                    stack.pop();
            }
        }
        return stack.isEmpty();
    }
}
