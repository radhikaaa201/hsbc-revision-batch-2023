class A {  
	public static void main(String[] args)  {
		System.out.println("main in A1");
		int[] arrays = { 2, 3, 1, 5 } ;
		main(arrays);
	}
	public static void main(int[] args)  {
		System.out.println("main in A2");
	}
}

class D {  					
	D(int s) { } 
	void demo(int x) {
		System.out.println("demo in D");
	}
}
class E { 
	void demo() {
		System.out.println("demo in E");
	}
}

// to compile you will use javac Hello.java