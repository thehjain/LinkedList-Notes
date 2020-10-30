//Here we have given a Y Linked list and we have
//to find intersection point of linked list

//One approach is to store any one list in hashset
//keep traversing other list and return the node
//where it matches in hashset

//Another approach is to use two pointer's and
//keep both pointers on both list and keep changing
//list for pointer's until it meet.


public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
	if (headA == null || headB == null)
		return null;
	ListNode a = headA;
	ListNode b = headB;
	while (a != b) {
		a = a == null ? headB : a.next;
		b = b == null ? headA : b.next;
	}
	return a;
}


//Problem is available on leetcode