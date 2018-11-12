package week_7.hometask.mylinkedlist;

public class IntLLApp {
    public static void main(String[] args) {
        MyLinkedList<Integer> list = new MyLinkedList();
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(8);
        list.add(0,5 );
        list.revertNode();

//        LinkedList<Integer> l = new LinkedList<>();
//        l.add(1);
//        l.add(2);
//        l.add(3);
//        l.add(3,4);
//
//        System.out.println("L:" + l);
        System.out.println(list);
        System.out.println("Size is " + list.size());

        list.clear();
        System.out.println(list);

        list.add(7);
        System.out.println(list.getFirst());
    }
}
