/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */

 // O(N^2) TC
public class Solution {
    public int solve(ListNode A) {
        ListNode dummy = new ListNode(-1);
        ListNode cur = A, prev = dummy;
        int ans = 0;

        while (cur != null) {
            // Case 1: cur is a center node of palindrome of odd length

            ListNode prevItr = prev, nextItr = cur.next;
            int l = 1;
            while (prevItr != null && nextItr != null) {
                if (prevItr.val == nextItr.val) {
                    prevItr = prevItr.next;
                    nextItr = nextItr.next;
                    l++;
                } else break;

            }
            ans = Math.max(ans, l + l - 1);

            // Case 2: When palindrome length is even
            l = 0;
            prevItr = prev;
            nextItr = cur;

            while (prevItr != null && nextItr != null) {
                if (prevItr.val == nextItr.val) {
                    prevItr = prevItr.next;
                    nextItr = nextItr.next;
                    l++;
                } else break;

            }

            ans = Math.max(2 * l, ans);

            ListNode Next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = Next;
        }

        return ans;
    }
}
