package study;
// Java program Find Out the Number of Objects Created
// of a Class
class Test {

	static int noOfObjects = 0;

	// Instead of performing increment in the constructor
	// instance block is preferred to make this program generic.
	{
		noOfObjects += 1;
	}

	// various types of constructors
	// that can create objects
	public Test()
	{
	}
	public Test(int n)
	{
	}
	public Test(String s)
	{
		
	}

	public static void main(String args[])
	{
		 // Using traditional approach
		StringBuilder string=new StringBuilder("abcdef");
	    String result="";
	  //string.reverse();
	    for(int i=string.length()-1; i>=0; i--) {
	        result = result + string.charAt(i);}
		//Test t1 = new Test();
		//Test t2 = new Test(5);
		//Test t3 = new Test("GFG");
		String s1="abc";
		String s2="xyz";
		 s1= 40+40+s1+s2+40+40;
		String s3=new String(s1);
		// We can also write t1.noOfObjects or
		// t2.noOfObjects or t3.noOfObjects
		System.out.println(s1+s3);
		System.out.println(result);
	}
}



