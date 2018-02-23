package prod;
import bus.Calculator;
import java.util.Scanner;
public class CalculatorTestor {

	public static void main(String[] args) {
    Calculator c1 = new Calculator();
    Scanner scan = new Scanner(System.in);
//    int op1 = 5; int op2 =3;
//    c1.setOp1(op1);
//    c1.setOp2(op2);
    System.out.println("Enter first value :");
    c1.setOp1(scan.nextInt());
    System.out.println("Enter second value :");
    c1.setOp2(scan.nextInt());
    System.out.println(c1.getOp1()+
    		"+" + c1.getOp2() + "=" + c1.add());
	}

}
