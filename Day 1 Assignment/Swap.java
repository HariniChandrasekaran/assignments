public class Pgrm {
	static int a=10;
	int b=20;

	public static void main(String[] args) {
		Pgrm pg=new Pgrm();
		a=a+pg.b;
		pg.b=a-pg.b;
		a=a-pg.b;
		System.out.println(a);
		System.out.println(pg.b);
		
		
	}

}