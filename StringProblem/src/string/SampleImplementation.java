package string;
import java.util.*;
public class SampleImplementation extends Problem2
{
	static SampleImplementation prob = new SampleImplementation();
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		String m = sc.nextLine();
		System.out.println(a+b+m);
		/*prob.setS(m);
		System.out.println(prob.add(a, b));
		System.out.println(prob.sub(a, b));
		System.out.println(prob.mul(a, b));
		System.out.println(prob.div(a, b));
		System.out.println(prob.toUpper(prob.getS()));*/
	}
	
}
