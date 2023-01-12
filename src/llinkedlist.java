//import implement_queue.node;

class node{
	
	int data;
	node next;
	//node head;
	node(int d){
		
		data= d;
		next= null;
		//head=null;
		
		
		
		
	}
}
class linkedlist{
      node head;
	int size;
	
	linkedlist(){
		head= null;
		size =0;
	
}
	
	void insert(int data,linkedlist list) {
		
		
		

		node temp = new node(data);
		if(list.head==null)
		{
			list.head= temp;
			
			
		}
		
		else {
			node last = list.head;
			while(last.next!=null) {
				
				last= last.next;
				
			}
			
			last.next= temp;
		}
		
		}
	
	//pop the last element from ll
	void pop(linkedlist list) {
		if(list.head==null) {
		System.out.print("delete is not happen");
	} 
		
		if(list.head.next==null) {
			list.head.next=null;
		}
		node last= list.head;
		while(last.next.next!=null) {
		last = last.next;
		}
		
					last.next=null;
	}
	
		
		
//		
//	

	// delete an eelement fron the first
	void pop1(linkedlist list) {
		if(list.head==null) {	
			System.out.print("delete is not possible");
		}			
		
		node temp = list.head;
		head= list.head.next;
		
	}
	
	
	
		 
	public static  void PrintList(linkedlist list) {
		node current= list.head;
		System.out.print("LinkedList");
		
		while(current!=null)
		{
			
			System.out.print("->->the nextis"+current.data+" ");
			current = current.next;
			
			
		}
	}
	
}





public class llinkedlist {
	
	public static void main(String [] args) {

		linkedlist list = new linkedlist();
			list.insert(14,list);
		list.insert(16,list);
		list.insert(18,list);
		list.insert(122,list);
        list.pop(list);
        list.pop1(list);
//		
		list.PrintList(list);
		
		

		
	}
	
}
