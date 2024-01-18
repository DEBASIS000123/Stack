package UsingArray;
import java.util.Scanner;
public class Test {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the arraylist size:");
		int size=sc.nextInt();
		Stack ss=new Stack();
		ss.create(size);
		System.out.println(ss.isEmpty());
		ss.push(19);
		System.out.println(ss.peak());
		ss.push(76);
		System.out.println(ss.peak());
		ss.push(99);
		ss.pop();
		System.out.println(ss.peak());
		System.out.println(ss.isEmpty());
	}

}
