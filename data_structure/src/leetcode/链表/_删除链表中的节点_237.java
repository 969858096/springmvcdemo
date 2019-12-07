package leetcode.链表;

/**
 * @FileName: _删除链表中的节点_237
 * @Description: https://leetcode-cn.com/problems/delete-node-in-a-linked-list/
 * @AuthOr: lsp
 * @Date: 2019/12/8 00:01
 */
public class _删除链表中的节点_237 {

    static void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }

}
