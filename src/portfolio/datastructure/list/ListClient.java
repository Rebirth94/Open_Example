package portfolio.datastructure.list;

import portfolio.datastructure.list.list.LinkedListExample;
import portfolio.datastructure.list.list.ListExample;

public class ListClient {
	public static void main(String[] args) {
		ListExample<Integer> list = new LinkedListExample<>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		System.out.println( list.get(0) );
		System.out.println( list.get(1) );
		System.out.println( list.get(2) );
		System.out.println( list.get(3) );
		System.out.println( list.get(4) );


	}
}
