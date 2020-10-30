//Here we have given a linked list and we have to
//reverse the linked list in groups of size given

//Approach is to reverse a linked list in groups
//and keep counting the size of list

public static Node reverse(Node node, int k) {
	//Your code here
	Node prev = null;
	Node next = null;
	Node curr = node;
	int count = 0;
	while (count < k && curr != null) {
		next = curr.next;
		curr.next = prev;
		prev = curr;
		curr = next;
		count++;
	}
	if (next != null)
		node.next = reverse(next, k);
	return prev;
}


//Problem is available on GFG