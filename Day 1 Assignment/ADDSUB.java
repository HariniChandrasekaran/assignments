public class Add {
	int b=10;
	static int a=5;

	public static void main(String[] args) {
		//addition
		Add add=new Add();
		int x=a;
		int y=add.b;
		while(add.b!=0)
		{
			int sum=(a & add.b);
			a=a^add.b;
			add.b=sum<<1;
		}
		System.out.println("sum "+a);
		
		//subtraction
		while(y!=0)
		{
			int sub=((~x)&y);
			x=x^y;
			y=sub<<1;
		}
		System.out.println("sub " +x);
		
	}

}
