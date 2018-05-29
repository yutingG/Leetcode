package Easy._021;

import java.util.List;

/**
 * @Author: guoyuting
 * @Date: Created in 2018/5/29 20:56
 */
public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();

        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);

        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(5);

        ListNode result = solution.mergeTwoLists(l1, l2);
        System.out.println(result.val + "" + result.next.val + "" + result.next.next.val + "" + result.next.next.next.val + result.next.next.next.next.val);

    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode header = new ListNode(0);
        ListNode p = l1, q = l2, curr = header;
        while (p != null || q != null) {
            int x, y;
            if (p != null) {
                x = p.val;
            } else {
                curr.next = q;
                break;
            }

            if (q != null) {
                y = q.val;
            } else {
                curr.next = p;
                break;
            }

            if (x <= y) {
                curr.next = new ListNode(x);
                curr = curr.next;
                p = p.next;
            } else {
                curr.next = new ListNode(y);
                curr = curr.next;
                q = q.next;
            }
        }
        return header.next;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        this.val = x;
    }
}
