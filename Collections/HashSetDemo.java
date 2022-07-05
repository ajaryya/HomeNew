package Collections;

import java.util.HashSet;
import java.util.Iterator;

class ajaryyaexception extends RuntimeException{
	ajaryyaexception(String msg){
		super(msg);
	}
}

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet hashOne = new HashSet();

		hashOne.add(19);
		hashOne.add("ajaryya");
		hashOne.add(12.0);
		hashOne.add('a');

		System.out.println(hashOne);

//		hashOne.clear();
//		System.out.println(hashOne);

		Iterator iteratorOne = hashOne.iterator();

		while (iteratorOne.hasNext()) {
			System.out.println(iteratorOne.next());
		}

		System.out.println(hashOne.size());
		
		System.out.println(hashOne.contains("ajaryya"));
		hashOne.remove("ajaryya");
		System.out.println(hashOne);
		System.out.println(hashOne.contains("ajaryya"));
//		hashOne.removeAll(hashOne);
//		System.out.println(hashOne);
		HashSet hashTwo= new HashSet();
		hashTwo.add(hashOne);
		hashTwo.add("awesome");
		hashTwo.add("ajaryya");
		hashTwo.add("ojas innovative technologies");
		
		System.out.println(hashTwo);
		HashSet hashThree=hashTwo ;
		System.out.println(hashThree);
		hashThree.add(hashTwo);
		System.out.println(hashThree);
		
		HashSet hashFour=(HashSet) hashOne.clone();
		System.out.println(hashFour);
		if(hashFour.containsAll(hashOne))
		{
			throw new ajaryyaexception("duplicate of two hashSets waste of memory");
		}
		

	}

}
