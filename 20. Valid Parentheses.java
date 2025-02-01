class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        int index = 0;
        int size = s.length();
        boolean flag = false;
        while(index<size){
            if(stack.isEmpty()){
                stack.push(s.charAt(index));
                index++;
                continue;
            }
            char ele = stack.peek();
            if( (ele=='(') && (s.charAt(index) == ')') ){
                flag = true;
            }else if( (ele=='[') && (s.charAt(index) == ']') ){
                flag = true;   
            }else if( (ele=='{') && (s.charAt(index) == '}')  ){
                flag = true;
            } 
            if(flag){
                stack.pop();
                index++;
                flag = false;
                continue;
            }
            stack.push(s.charAt(index));
            index++;
        }

        return stack.isEmpty();
    }
}