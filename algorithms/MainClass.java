
public class MainClass{

  public static void main(String[] args){

    checkLinkedList();


  }


  public static void checkLinkedList(){

    LinkedList linkedList = new LinkedList();
    linkedList.push_front(7);
    linkedList.push_front(4);
    linkedList.push_front(3);
    linkedList.push_front(2);
    linkedList.push_front(1);
    linkedList.pop_front();
    linkedList.push_back(9);
    linkedList.insert(4,10);
    linkedList.insert(0,8);
    linkedList.insert(3,13);

    System.out.println("Size is " + linkedList.size());
    int position = 0;
    System.out.println("Value at position " + position + " -> " + linkedList.value_at(position));
    linkedList.print();


  }



}
