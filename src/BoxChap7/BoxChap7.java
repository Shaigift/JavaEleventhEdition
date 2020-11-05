package BoxChap7;

public class BoxChap7 {
	class Test {
		  int a;

		  Test(int i) {
		    a = i;
		  }

		  Test incrByTen() {
		    Test temp = new Test(a+10);
		    return temp;
		  }
		}

		class RetOb {
		  public static void main(String args[]) {
		    Test ob1 = new Test(2);
		    Test ob2;

		    ob2 = ob1.incrByTen();
		    System.out.println("ob1.a: " + ob1.a);
		    System.out.println("ob2.a: " + ob2.a);

		    ob2 = ob2.incrByTen();
		    System.out.println("ob2.a after second increase: "
		                        + ob2.a);
		  }
		}

		listing 10
		// A simple example of recursion.
		class Factorial {
		  // this is a recusive function
		  int fact(int n) {
		    int result;

		    if(n==1) return 1;
		    result = fact(n-1) * n;
		    return result;
		  }

}
