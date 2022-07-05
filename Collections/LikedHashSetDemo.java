package Collections;

import java.util.LinkedHashSet;

public class LikedHashSetDemo {

	public static void main(String[] args) {
		LinkedHashSet lhs= new LinkedHashSet();
		lhs.add(null);
		lhs.add(19);
		lhs.add("ajaryya");
		lhs.add(13.5);
		System.out.println(lhs);
		System.out.println(lhs.contains(19));

	}

}
