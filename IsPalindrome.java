//Here we have given a linked list and we have to
//check if it is palindrome or not

//First approach is store the linked list in stack
//and then traverse both stack and list together
//keep checking


//Another approach is to reverse a second half of
//linked list and keep checking first half and
//second half

static ListNode left, headA;
public boolean isPalindrome(ListNode head) {
	headA = head;
	return isPalindromeUtil(head);
}
boolean isPalindromeUtil(ListNode right) {
	left = headA;
	if (right == null) return true;
	boolean isTrue = isPalindromeUtil(right.next);
	if (!isTrue) return false;
	boolean istrue = (right.val == left.val);
	left = left.next;
	return istrue;
}



//Problem is available on leetcode