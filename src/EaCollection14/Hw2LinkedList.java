package EaCollection14;

/**
 * @author Zhongbo Li
 * @version 1.0
 *
 * Arraylist 可变数组 增删效率低 数组扩容   改查效率高
 * Linkedlist 双向链表  效率高 链表追加    改查效率低
 *
 * 一般来说项目80-90%都是查询，所以大部情况都用arraylist
 *
 */
public class Hw2LinkedList {
    public static void main(String[] args) {
        Node a = new Node("a");
        Node b = new Node("b");
        Node c = new Node("c");
        a.next = b;
        b.next = c;
        Node first =a;
        c.prep =b;
        b.prep =a;
        Node last = c;
        while(true){
            if(first==null){
                break;
            }
            System.out.println(first);
            first =first.next;
        }

        while(true){
            if(last==null){
                break;
            }
            System.out.println(last);
            last = last.prep;
        }

    }
}
class Node{
    public Node prep;
    public Object item;
    public Node next;

    public Node(Object name) {
        this.item = name;
    }

    @Override
    public String toString() {
        return "item=" + item ;
    }
}