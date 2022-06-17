
public class MethodTypes {
	
	public void sayHello(String name) {
		System.out.println("welcome to ojas   " +name);
	}
	public int add(int i,int j) {
		return i + j;
	}
	public static void m1() {
		System.out.println("from m1 static method");
	}

	public final void m2() {
		System.out.println("from m2 final method");
	}
	public synchronized void m3() {	
		System.out.println("from synchronized method");
	}
	
	public static void main(String[] args) {
		MethodTypes obj= new MethodTypes();
		obj.sayHello("Ajaryya");
		System.out.println(obj.add(10, 20));
		m1();//static method
		obj.m2();//final method
		obj.m3();//Synchronized method
		

	}

}
