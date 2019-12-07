package leetcode.链表;

import java.util.LinkedList;

/**
 * @FileName: _反转链表_206
 * @Description: https://leetcode-cn.com/problems/reverse-linked-list/
 * @AuthOr: lsp
 * @Date: 2019/12/8 00:41
 */
public class _反转链表_206 {

    //递归思想
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode newHead = reverseList(head.next);

        head.next.next = head;
        head.next = null;
        return newHead;
    }

    //非递归思想
    public static ListNode reverseList2(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode newHead = null;
        ListNode temp = head.next;
        head = newHead;
        newHead = head;
        head = temp;
        return newHead;
    }


}
