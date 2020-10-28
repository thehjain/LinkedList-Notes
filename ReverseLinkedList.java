// //Given a Linked List we have to reverse it.

// //One to solution is to do it with recursion.
// //Another is simply using next and prev pointer.


// public ListNode reverseList(ListNode head) {
// 	ListNode curr = head, prev = null, next = null;
// 	while (curr != null) {
// 		next = curr.next;
// 		curr.next = prev;
// 		prev = curr;
// 		curr = next;
// 	}
// 	head = prev;
// 	return head;
// }



// //Problem is available on leetcode










import java.util.*;
import java.io.*;
public class ReverseLinkedList {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());

		while (T-- != 0) {

			int n = Integer.parseInt(br.readLine());

			String[] input = br.readLine().trim().split(" ");

			int[] arr = new int[n];

			int index = 0;
			for (String ele : input)
				arr[index++] = Integer.parseInt(ele);

			int res = findMin(arr, n);

			System.out.println(res);
		}

	}
	static int findMin(int[] arr, int n) {

		int[] visited = new int[201];
		int res = 0;
		int res1 = 0;
		for (int i = 1; i <= 200; i++)
			visited[i] = i;

		for (int i = 0; i < n; i++) {
			if (visited[arr[i]] != 0) {
				visited[arr[i]] = 0;
				continue;
			} else {
				int left = arr[i], right = arr[i];
				while (left > 0 || right < 201) {
					left--;
					right++;
					if (right < 201 && visited[right] != 0) {
						res += Math.abs(visited[right] - arr[i]);
						visited[right] = 0;
						break;
					}
					if (left > 0 && visited[left] != 0) {
						res += Math.abs(visited[left] - arr[i]);
						visited[left] = 0;
						break;
					}

				}
				//System.out.print(res + " ");
			}

		}
		for (int i = 1; i <= 200; i++)
			visited[i] = i;
		for (int i = 0; i < n; i++) {
			if (visited[arr[i]] != 0) {
				visited[arr[i]] = 0;
				continue;
			} else {
				int left = arr[i], right = arr[i];
				while (left > 0 || right < 201) {
					left--;
					right++;
					if (left > 0 && visited[left] != 0) {
						res1 += Math.abs(visited[left] - arr[i]);
						visited[left] = 0;
						break;
					}
					if (right < 201 && visited[right] != 0) {
						res1 += Math.abs(visited[right] - arr[i]);
						visited[right] = 0;
						break;
					}


				}
				//System.out.print(res + " ");
			}

		}
		return Math.min(res, res1);
	}

}
