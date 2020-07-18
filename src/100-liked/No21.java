
public class No21 {
  public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    // method1
/*     ListNode ans = new ListNode();
     ListNode ptr = ans;
     while (l1 != null && l2!= null) {
       if (l1.val < l2.val) {
         ptr.next = new ListNode(l1.val);
         l1 = l1.next;
       } else {
         ptr.next = new ListNode(l2.val);
         l2 = l2.next;
       }
       ptr = ptr.next;
     }
     if (l1 == null) {
       ptr.next = l2;
     }
     if (l2 == null) {
       ptr.next = l1;
     }
     return ans.next;*/
//method2
    if (l1 == null) {
      return l2;
    }
    if (l2 == null) {
      return l1;
    }
    ListNode dummyHead = new ListNode();
    if (l1.val <= l2.val) {
      dummyHead = new ListNode(l1.val, mergeTwoLists(l1.next,l2));
    } else {
      dummyHead = new ListNode(l2.val, mergeTwoLists(l1,l2.next));
    }
    return dummyHead;
  }
}
