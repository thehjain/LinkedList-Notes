//From many apporaches one efficient approach is to
//detect a loop using slow and fast pointer
//and then remove the function using this function


void removeLoop(Node loop, Node head) {
	Node ptr1 = loop;
	Node ptr2 = loop;

	int k = 1, i;
	while (ptr1.next != ptr2) {
		ptr1 = ptr1.next;
		k++;
	}

	ptr1 = head;

	ptr2 = head;
	for (i = 0; i < k; i++) {
		ptr2 = ptr2.next;
	}

	while (ptr2 != ptr1) {
		ptr1 = ptr1.next;
		ptr2 = ptr2.next;
	}

	while (ptr2.next != ptr1) {
		ptr2 = ptr2.next;
	}

	ptr2.next = null;
}


//Problem is available on geeksforgeeks