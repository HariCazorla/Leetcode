class Solution {
    public List<String> letterCombinations(String digits) {
        if (digits.length() == 0) return Collections.emptyList();
        
        String dial[] = new String[] {
            "0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"
        };
        
        LinkedList<String> solution = new LinkedList<String>();
        solution.add("");
        
        for(int i = 0; i < digits.length(); i++) {
            int index = Character.getNumericValue(digits.charAt(i));
            while (solution.peek().length() != i+1) {
                String permutation = solution.remove();
                for (char c : dial[index].toCharArray()) {
                    solution.add(permutation + c);
                }
            }
        }
        return solution;
    }
}