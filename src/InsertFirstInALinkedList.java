public class InsertFirstInALinkedList {
    private ListNode head;

    public class ListNode {
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
                    System.out.print(current.data + "-->");
                    current = current.next;
                }
            System.out.println("null");
        }
        public void insert(int value){
            ListNode newNode = new ListNode(value);
            newNode.next = head;
            head = newNode;
        }

        public static void main(String[] args) {
            InsertFirstInALinkedList obj = new InsertFirstInALinkedList();
            obj.insert(11);
            obj.insert(12);
            obj.display();

        }

    }

