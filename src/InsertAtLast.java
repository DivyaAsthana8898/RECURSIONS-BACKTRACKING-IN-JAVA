public class InsertAtLast {
    private ListNode head;

    public static class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public void display(){
        ListNode current = head;
        while(current != null){
            System.out.print(current.data + "--->");
            current = current.next;
        }
        System.out.println("null");
    }
    public void insertAtLast(int value){
        ListNode newNode = new ListNode(value);
        if(head == null){
            head = newNode;
            return;
        }
        ListNode current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next = newNode;
    }

    public static void main(String[] args) {
        InsertAtLast obj = new InsertAtLast();
        obj.insertAtLast(12);
        obj.insertAtLast(13);
        obj.insertAtLast(15);
        obj.insertAtLast(16);

        obj.display();
    }


}
