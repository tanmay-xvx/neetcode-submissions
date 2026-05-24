class Solution {
    public boolean isValid(String s) {
        Map<Character,Character> brackets =  Map.of(
        ']', '[',
        '}', '{',
        ')', '('
        );
        Stack<Character> stack = new Stack<>();

        for(char c : s.toCharArray()){
            if(brackets.containsKey(c)){
                if(!stack.isEmpty() && stack.peek() == brackets.get(c)){
                    stack.pop();
                }else{
                    stack.push(c);
                }

            }else{
                stack.push(c);
            }
        }

        return stack.isEmpty();

    }
}
