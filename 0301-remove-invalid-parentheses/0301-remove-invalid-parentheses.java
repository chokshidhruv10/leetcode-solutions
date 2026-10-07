import java.util.*;
class Solution {
    public List<String> removeInvalidParentheses(String s) {
        Set<String> result = new HashSet<>();
        Stack<Integer> stack = new Stack<>();
        int removeLeft = 0;
        int removeRight = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(1);
            } else if (c == ')') {
                if (!stack.isEmpty())
                    stack.pop();
                else
                    removeRight++;
            }
        }
        removeLeft = stack.size();
        backtrack(s, 0, removeLeft, removeRight,
                new StringBuilder(), result);
        return new ArrayList<>(result);
    }
    private void backtrack(String s, int index, int removeLeft,
                           int removeRight, StringBuilder path,
                           Set<String> result) {
        if (index == s.length()) {
            if (removeLeft == 0 && removeRight == 0 && isValid(path))
                result.add(path.toString());
            return;
        }
        char c = s.charAt(index);
        if (c == '(' && removeLeft > 0)
            backtrack(s, index + 1, removeLeft - 1, removeRight, path, result);
        if (c == ')' && removeRight > 0)
            backtrack(s, index + 1, removeLeft, removeRight - 1, path, result);
        path.append(c);
        backtrack(s, index + 1, removeLeft, removeRight, path, result);
        path.deleteCharAt(path.length() - 1);
    }
    private boolean isValid(StringBuilder s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toString().toCharArray()) {
            if (c == '(')
                stack.push(c);
            else if (c == ')') {
                if (stack.isEmpty())
                    return false;
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}
