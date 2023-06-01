
public class Static_Blocks {
	    // static variable belongs to class it self rather than any instances
	    static int a = 10;
	    // there will be only one copy of variable in the entire memory
	    static int b;
	     
	    // it is used to initialize any one time task that needs to be run
	    static {
	        System.out.println("Static block initialized.");
	        b = a * 4;
	    }
	    // the main method always hold the static keyword
	    public static void main(String[] args)
	    {
	       System.out.println("from main");
	       System.out.println("Value of a : "+a);
	       System.out.println("Value of b : "+b);
	    }

}

