import java.util.Scanner;

public class FirstProject {
	public static void main(String args[])
	{
	//int b = 129;
	//byte a = (byte) b;
	//System.out.println(a);
	//String x = "10";
	//int a = Integer.parseInt(x);
	//System.out.println(a);
	Scanner input = new Scanner(System.in);
	int a = input.nextInt();
	//int b = input.nextInt();
	//int c = input.nextInt();
	input.close();
	//if (a>b && a>c)
		//System.out.println(a);
	//else if (b>c)
		//System.out.println(b);
	//else
		//System.out.println(c);
	switch (a) {
	case 1:
		System.out.println("First case");
		break;
	case 2:
		System.out.println("Second case");
		break;

	default:
		break;
	}
	}

}
