package UsingLinkedList;
import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Stack stk=new Stack();
		while(true){
			System.out.println("**************************");
			System.out.println("0.Exit");
			System.out.println("1.Display");
			System.out.println("2.push");
			System.out.println("3.pop");
			System.out.println("4.peak");
			System.out.println("**************************");
			System.out.println("Enter your choice:");
			int ch=sc.nextInt();
			switch(ch) {
			case 0:System.out.println("Thanak you.");
			return;
			case 1:stk.display();
			break;
			case 2:System.out.println("Enter the elemet:");
					int n=sc.nextInt();
					stk.push(n);
			break;
			case 3:System.out.println(stk.pop());
			break;
			case 4:System.out.println(stk.peak());
			break;
			default:System.out.println("Invalid Choice.");
			}
		}
	}

}
