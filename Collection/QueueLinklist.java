package Collection;
import java.util.LinkedList;
public class QueueLinklist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList ls= new LinkedList();
		ls.add("A");
		ls.add("B");
		ls.add("C");
		ls.add("D");
		ls.add("E");
		ls.add("F");
		
		LinkedList ls1= new LinkedList();
		ls1.add("a");
		ls1.add("b");
		ls1.add("c");
		ls1.add("d");
		ls1.add("e");
		ls1.add("f");
		//add
		System.out.println(ls);
		System.out.println(ls1);
		ls.add(1,"Z" );
		System.out.println(ls);
		ls.addAll(ls1);
		System.out.println(ls);
		ls.addAll(2, ls1);
		System.out.println(ls);
		ls.addFirst("M");
		System.out.println(ls);
		ls.addLast("N");
		System.out.println(ls);
		ls.offer("yuvraj");
		System.out.println(ls);
		ls.offerFirst("yuvraj");
		System.out.println(ls);
		ls.offerLast("jadhav");
		System.out.println(ls);
		
		//remove
		ls.remove();
		System.out.println(ls);
		ls.remove("a");
		System.out.println(ls);
		ls.removeAll(ls1);
		System.out.println(ls);
		ls.removeFirst();
		System.out.println(ls);
		ls.removeFirstOccurrence("Z");
		System.out.println(ls);
		//ls.removeIf("A");
		ls.removeLastOccurrence("F");
		System.out.println(ls);
		ls.removeLast();
		System.out.println(ls);
		ls.poll();
		System.out.println(ls);
		
		ls.pollFirst();
		System.out.println(ls);
		ls.pollLast();
		System.out.println(ls);
	}

}
