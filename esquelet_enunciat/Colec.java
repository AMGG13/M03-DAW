import java.util.*;

public class Colec {

	public static void main(String[] args) {
		
		List<Integer> data = new LinkedList<>();
		
		//populate data.
		data.add(new Integer(23));
		data.add(new Integer(12));
		data.add(new Integer(10));
		data.add(new Integer(45));
		
		System.out.println("Number of elements: "+data.size());
		
		System.out.println("Iterate with for-each loop");
		for (Integer elem: data) {
			System.out.println(elem.toString());	
		}
		
		System.out.println("Iterate with iterator");
		Iterator<Integer> iter = data.iterator();
		while (iter.hasNext()) {
			Integer elem = iter.next();
			System.out.println(elem.toString());
		}
		
		System.out.println("Collection contains 23: "+data.contains(23));
		System.out.println("Collection contains 99: "+data.contains(99));
		
		System.out.println("Is empty?:" + data.isEmpty());
		
		System.out.println("Remove element 23");
		data.remove(new Integer(23));
		for (Integer elem: data) {
			System.out.println(elem.toString());	
		}
		
		System.out.println("Iterate with listiterator");
		ListIterator<Integer> iter2 = data.listIterator();
                
		while (iter2.hasNext()) {
			Integer elem = iter2.next();
			System.out.println("Next elem: " + elem.toString());
                       
		}	
                 
		
		System.out.println("Add an element at index 1");
		data.add(1, new Integer(55));
		printList(data);
		
		System.out.println("Add an element at the top of the list");
		data.add(new Integer(77));
		printList(data);
		
		System.out.println("Modify element at index 2");
		data.set(2, new Integer(44));
		printList(data);
		
		System.out.println("Iterate with a counter and use method get");
		for (int i = 0; i<data.size(); i++){
			Integer elem = data.get(i);
			System.out.println(elem.toString());
		}
		
		System.out.println("To string method");
		System.out.println(data.toString());
		
		System.out.println("Index of method");
		int p = data.indexOf(44);
		System.out.println("Index of elem 44= " +p);
	}

	private static void printList(List<Integer> l) {
		for (Integer elem: l) {
			System.out.println(elem.toString());	
		}
	}








}
