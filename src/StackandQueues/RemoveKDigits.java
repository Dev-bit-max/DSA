package StackandQueues;

import java.util.Stack;

class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Integer> ans = new Stack<>();
        if (k == num.length()) {
            return new String("0");
        }
        for (int i = 0; i < num.length(); i++) {
            while ((!ans.isEmpty()) && k > 0 && (int) (num.charAt(i) - '0') <= ans.peek()) {
                k--;
                ans.pop();
            }
            ans.push((int) (num.charAt(i) - '0'));
        }
        while (k != 0) {
            k--;
            ans.pop();
        }
        if (ans.size() == 0) {
            return new String("0");
        }

        StringBuilder re = new StringBuilder();
        while (!ans.isEmpty()) {
            re.append(ans.peek());
            ans.pop();
        }
        while ((!re.isEmpty()) && (re.charAt(re.length() - 1) == '0')) {
            re.deleteCharAt(re.length() - 1);
        }
        re.reverse();
        if (re.length() == 0) {
            return new String("0");
        }
        return re.toString();
    }
}
