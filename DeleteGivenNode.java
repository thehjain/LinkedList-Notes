//Here we have to remove the given node
//in singly linked list

//Just copy the data of next node and remove the
//next node


public void deleteNode(ListNode node) {
	node.val = node.next.val;
	node.next = node.next.next;
}


//Problem is available on leetcode