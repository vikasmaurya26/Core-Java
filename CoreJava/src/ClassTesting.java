import java.text.ParseException;

public class ClassTesting {
	
	int a;
	String test="5";
	int test1=Integer.parseInt(test);
	String test2=Integer.toString(test1);
	
	public static void main(String []agrd)
	{
		
		ClassTesting ct=new ClassTesting();
		System.out.println(ct.a);
		System.out.println(ct.test);
		System.out.println(ct.test1);
		System.out.println(ct.test2);
		
	}

}
