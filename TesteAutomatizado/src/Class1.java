

public class Class1 {
	
	public int fibonacci(int n) {
		int atual=0,anterior=1,anteterior=0;
		
		for(int i=1;i<=n;i++) {
			anteterior=anterior;
			anterior=atual;
			atual=anterior+anteterior;
		}
		
		return atual;
	}
	
	public static void main(String[] args) {
		
		Class1 c = new Class1();
		System.out.println(c.fibonacci(5));
		
	}
}
