
public class Main {
    public static void main(String[] args) {
        myList list = new myList();



        list.insertFirst(5);
        list.insertLast(10);
        list.insertAfter(5, 7);
        list.insertBefore(10, 8);

        list.printAll();

        list.deleteFirst();
        list.deleteLast();
        list.deleteItem(7);

        list.printAll();
        System.out.println("First item: " + list.printFirst());
        System.out.println("Last item: " + list.printLast());
        System.out.println("Is 10 present? " + list.searchItem(10));

    }
}
