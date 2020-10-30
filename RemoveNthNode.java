//Here we have given a linked list
//and we have to remove nth node from
//back of linked list

//Approach is to first count the number of nodes and
//then from total size substarct n value and remove
//that node

//Another approach can be using two pointers by first
//moving first pointer to nth node and then start moving
//both nodes together and remove first node.

public ListNode removeNthFromEnd(ListNode head, int n) {

	ListNode dummy = new ListNode(0);
	dummy.next = head;
	int size = countTotal(head);
	int deleting_node = size - n;
	ListNode curr = dummy;
	while (deleting_node > 0) {
		deleting_node--;
		curr = curr.next;
	}
	curr.next = curr.next.next;
	return dummy.next;
}
int countTotal(ListNode head) {
	int count = 0;
	ListNode curr = head;
	while (curr != null) {
		count++;
		curr = curr.next;
	}
	return count;
}


//Problem is available on leetcode