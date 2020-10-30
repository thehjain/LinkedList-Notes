//We have given a linked list and k value
//We have right shift or right rotate a linked
//list by k.

public ListNode rotateRight(ListNode head, int k) {
	if (head == null || k == 0) return head;
	int len = 1;
	ListNode curr = head;
	while (curr.next != null) {
		curr = curr.next;
		len++;
	}
	curr.next = head;
	//curr=head;
	k %= len;
	for (int i = 0; i < len - k; i++)
		curr = curr.next;
	head = curr.next;
	curr.next = null;
	return head;
}


//Problem is available on leetcode