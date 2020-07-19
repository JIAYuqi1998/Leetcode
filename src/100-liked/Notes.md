# No.20 Valid Parentheses
The main idea is using stack. When encounter the left Parentheses, we push it into the stack. If we encounter a right Parentheses, we need to check whether the stack is empty, if not, check whether the first item in stack meets with the right Parentheses now.
After iterating through the whole string, if the stack is not empty, which means there are still some left Parentheses not matched, return false. If it is empty, all the Parentheses in the string are matched.
# No.21 Merge Two Sorted Lists
Firstly, I use the general idea, scan through l1 and l2 until one of them is empty, add the smaller value of l1.val or l2.val to return answer. When one of them is empty, add the other segment as the `next` for answer. However, Always remember that when java creates a class with a value, the value is not null, if its int, then the default value is 0; we can treat it as the dummy head for convenience.

The other solution is recursion. When the input class is the same as the output, we could always consider recursion.

However, in practical use, recursion is not used usual, because a long listnode will result in stack overflow exception.

And for the first solution, we could use in-place algorithm to avoid auxiliary space resulting from creating new listnode to store the result.

create a ListNode which might require many resource allocations or inaccessible dependencies.

So ideally, we should pick up either the head of l1 or l2 as the head other than creating a new one, which however makes the initialization step tedious.

# No.5 Longest Palindromic Substring
Firstly, we use brutal force to solve the problem. We check every possible substring, if it is longer than the known longest sbustring, we replace the answer with it and update the maximum length. However, the time complexity is n cubic, which is not efficient.

The second approach is extending Palindromic. We discuss the situation where the situation's length is odd or even. And push the boundary of Palindromic one by one by adding one to the right pointer and minus one to the left pointer. Check after pushing and return the maximum length of each index.

Finnaly, it is dynamic programming. The objective function is f[i,j], which represents whether the substring of i to j is Palindromic or not. The object is to find the maximum j - i + 1(width) when f[i, j] is true.

Then, we need to find the transition function step by step.
for s = e, "a" is palindromic,

for s + 1 = e, "aa" is palindromic (if `str[s] = str[e]`)

for s + 2 = e, "aba" is palindromic (if `str[s] = str[e]` and "b" is palindromic)

for s + 3 = e, "abba" is palindromic (if `str[s] = str[e]` and "bb" is palindromic)

>state transition equation:

state(s, e) is true:

for s = e, 

for s + 1 = e,  if str[s] == str[e]

for s + 2 <= e, if str[s] == str[e] && state(s + 1, e - 1) is true

>note: state(s + 1, e - 1) should be calculated before state(s, e). That is, s is decreasing during the bottop-up dp implementation, while the dist between s and e is increasing, that's why

        for (int s = len - 1; s >= 0; s--) {
            for (int dist = 1; dist < len - i; dist++) {
>We keep track of longestPalindromeStart, longestPalindromeLength for the final output.
