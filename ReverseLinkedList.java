//Given a Linked List we have to reverse it.

//One to solution is to do it with recursion.
//Another is simply using next and prev pointer.


public ListNode reverseList(ListNode head) {
	ListNode curr = head, prev = null, next = null;
	while (curr != null) {
		next = curr.next;
		curr.next = prev;
		prev = curr;
		curr = next;
	}
	head = prev;
	return head;
}



//Problem is available on leetcode