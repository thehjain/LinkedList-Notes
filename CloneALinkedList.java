//Here we have given a linked list with random and
//next pointer and we have to clone this linked
//list and return the cloned linked list


//There are two approaches in O(n)
//first is to use hashMap and store the original nodes
//in Keys and cloned nodes in it values

//Another optimal approach is to do it without extra space
//using random and next pointer only

public Node copyRandomList(Node head) {

	if (head == null) return head;

	Node node = head;
	while (node != null) {
		Node copy = new Node(node.val);
		Node next = node.next;
		node.next = copy;
		copy.next = next;
		node = next;
	}
	node = head;
	while (node != null) {
		Node random = (node.random != null) ? node.random.next : null;
		node.next.random = random;
		node = node.next.next;
	}
	node = head;
	Node newhead = head.next;
	while (node != null) {
		Node p2 = node.next;
		node.next = p2.next;
		p2.next = p2.next != null ? p2.next.next : null;
		node = node.next;
	}
	return newhead;
}


//Problem is available both on leetcode and geeksforgeeks
