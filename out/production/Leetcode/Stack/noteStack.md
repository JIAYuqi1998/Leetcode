# No331
## Solution1: Stack
This problem can be solved by stack. When we encounter #, we peek at the top of the stack, if it was also #, then, we pop two items out of the stack. Iterate this process until the stack is empty.

The main idea is that two # represent a leaf node, we can cancle the leaf node. But we have to check whether this operation creates a new leaf node. Iterate until stack is empty.

---- if a number, say u, you know you just cancelled a node t which is left child of u. You need to leave a # mark to the top of stack. So that the next node know it is a right child.

---- if a #, you know you just cancelled a tree whose root, t, is the right child of u. So you continue to cancel sub tree of u, and the process goes on and on.

But we should take care of the edge cases, after popping out one item, the stack might be empty, which means there is no root for this leaf node, and we should return false.

## Solution2: Graph

Treat the binary tree as graph, then we know that the number of nodes = number of edges + 1.

For non-leaf node (not #), it will consume one edge and produce two edges.

For leaf node, it will consume one edge.

All we need to do is to check whether number of nodes = number of edges + 1.
# 946
## Solution1