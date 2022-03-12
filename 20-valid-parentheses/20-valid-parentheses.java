class Solution {
    public boolean isValid(String s) {
        Stack<Character> stk = new Stack<Character>();
        HashMap<Character, Character> map = new HashMap<Character, Character>();
        map.put('(',')');
        map.put('{','}');
        map.put('[',']');
        if (s.length() == 1) {
            return false;
        }
        for(int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                stk.push(c);
            } else {
                if (stk.empty()) {
                    return false;
                }
                Character top = stk.peek();
                if (c == map.get(top)) {
                    stk.pop();
                } else {
                    return false;
                }
            }
        }
        return stk.empty() ? true : false;
    }
}