//Here we have given linked list with bottom and next
//pointers and we have to flatten the list
//in a sorting manner

// 5 -> 10 -> 19 -> 28
//    |    |     |     |
//    V    V     V     V
//    7    20    22    35
//    |          |     |
//    V          V     V
//    8          50    40
//    |                |
//    V                V
//    30               45


//We have to flatten this

Node flatten(Node head) {
	if (head == null || head.next == null)
		return head;
	return merge(head, flatten(head.next));
}
Node merge(Node root, Node head) {
	if (root == null) return head;
	if (head == null) return root;

	Node res;

	if (root.data < head.data) {
		res = root;
		res.down = merge(root.data, head);
	} else {
		res = head;
		res.down = merge(root, head.down);
	}
	res.next = null;
	return res;
}


//Problem is available on geeksforgeeks