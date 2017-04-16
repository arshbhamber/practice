
public class LinkedList{

	Node first = null;
	Node last = null;
	int size;

	public int size(){
		return size;
	}

  public boolean empty(){

			return first == null;

	}

	public int value_at(int index){

		if(index>size){
			return 0;
		}

		if(index == 0)
			return first.value;

		Node node = first;
		int count = 0;

		while(node.hasNext()){
			node = node.next;
			count++;

			if(count == index){
				return node.value;
			}

		}
		return 0;

	}

	public void push_front(int value){

		Node node = new Node(value);
		node.next = first;
		first = node;

		size++;

	}

	public int pop_front(){

		if(first == null)
			return 0;

		int value = first.value;
		first = first.next;
		size--;
		return value;

	}

	public void push_back(int value){

		Node node = first;

		while(node.hasNext()){

				node = node.next;

		}

		Node n = new Node(value);
		node.next = n;
		n.next = null;

		size++;


	}

	public int pop_back(){
		return 0;
	}

	public int front(){

		if(first == null)
			return -1;

		return first.value;
	}

	public int back(){
		return 0;
	}

	public void insert(int index, int value){

		if(index == 0){
			push_front(value);
			return;
		}

		if(index == size){
			push_back(value);
			return;
		}

		Node head = first;
		int count = 0;

		while(head.hasNext()){

			count++;

			if(count == index){

				Node node = new Node(value);
				node.next = head.next;
				head.next = node;

				size++;

				return;

			}

			head = head.next;


		}

	}

	public void erase(int index){}




	public class Node{

		int value;
		Node next;
		Node prev;

		public Node(int value){
			this.value = value;
		}

		public boolean hasNext(){

			return (next != null);

		}


	}

	public void print(){

		System.out.println("LinkedList: ");
		Node node = first;

		while(node.hasNext()){

			System.out.println("" + node.value);

			node = node.next;

		}

		System.out.println("" + node.value);

	}


}
