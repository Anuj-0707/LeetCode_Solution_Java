/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        HashMap<Node ,Node> hp = new HashMap<>();
        Node temp = head;
        while(temp!=null){
            Node node = new Node(temp.val);
            hp.put(temp,node);
            temp=temp.next;
        }
        temp = head;
        while(temp!=null){
            Node ran = hp.get(temp.random);
            Node val = hp.get(temp);
            val.random=ran;
            val.next=hp.get(temp.next);
            temp=temp.next;
        }
        return hp.get(head);
    }
}