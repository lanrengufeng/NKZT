package JianZhiOffer;

public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
    
    
    public static void main(String[] args) {
		ListNode list = new ListNode(1);
		list.next = new ListNode(2);
		ListNode list2 = list;
		list2.next = new ListNode(6);
		//list2.val = 4;
		list2 = list2.next;
		System.out.println(list.val);
	}
}
