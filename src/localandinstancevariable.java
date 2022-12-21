

public class localandinstancevariable {
	
	int n = 500;
	
	void addition(int a,int b) {
		int n = 12;
		System.out.println(a+b+n);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		localandinstancevariable ni = new localandinstancevariable();
		ni.addition(10, 21);
	}



}
