package Medium._002;

/**
 * Problem_002 Add Two Numbers
 * @Author: guoyuting
 * @Date: Created in 2018/5/27 23:12
 */
public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode l1 = new ListNode(2);
        //System.out.println(l1.val);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        ListNode result = solution.addTwoNumbers(l1, l2);
        System.out.println(result.next.next.val + "" + result.next.val + "" + result.val);
    }

    public  ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode header = new ListNode(0);  // 存放相加结果
        ListNode p = l1, q = l2, curr = header;
        int carry = 0;
        while (p != null || q != null) {
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            int sum = x + y + carry;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if (p != null) p = p.next;
            if (q != null) q = q.next;
        }
        if (carry > 0) {
            curr.next = new ListNode(carry);
        }
        return header.next;
    }

}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
    }
}
