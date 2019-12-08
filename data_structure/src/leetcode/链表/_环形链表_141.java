package leetcode.链表;

/**
 * @FileName: _环形链表_141
 * @Description:  https://leetcode-cn.com/problems/linked-list-cycle/
 * @AuthOr: lsp
 * @Date: 2019/12/8 13:44
 */
public class _环形链表_141 {
    public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null){
            return false;
        }else{
            ListNode slow = head;
            ListNode fast = head.next;
            while(fast != null){
                if(fast == slow){
                    return true;
                }

                slow = slow.next;
                fast = fast.next.next;
            }
            return false;
        }

    }
}
