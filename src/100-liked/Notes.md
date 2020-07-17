# No.20 Valid Parentheses
The main idea is using stack. When encounter the left Parentheses, we push it into the stack. If we encounter a right Parentheses, we need to check whether the stack is empty, if not, check whether the first item in stack meets with the right Parentheses now.
After iterating through the whole string, if the stack is not empty, which means there are still some left Parentheses not matched, return false. If it is empty, all the Parentheses in the string are matched.
