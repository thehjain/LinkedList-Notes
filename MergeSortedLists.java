//WE have given two sorted lists
//and we have to merge the list


public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
	ListNode res = new ListNode(0);
	ListNode curr = res;
	while (true) {
		if (l1 == null) {
			curr.next = l2;
			break;
		}
		if (l2 == null) {
			curr.next = l1;
			break;
		}
		if (l1.val <= l2.val) {
			curr.next = l1;
			l1 = l1.next;
		} else {
			curr.next = l2;
			l2 = l2.next;
		}
		curr = curr.next;
	}
	return res.next;
}


//Problem is available on leetcode