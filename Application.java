package ua.lviv.lgs;

public class Application {

	public static void main(String[] args) {
		
		byte a1 = 1;
		short a2 = 2;
		int a3 = 3;
		float a4 = 4f;
		double a5 = 5.5;
		char a6 = 6;
		boolean a7 = true;
		long a8 = 8;
	
		
		
		System.out.println("Min byte value   = " + Byte.MIN_VALUE);
	    System.out.println("Max byte value   = " + Byte.MAX_VALUE);
	    System.out.println("Min short value  = " + Short.MIN_VALUE);
	    System.out.println("Max short value  = " + Short.MAX_VALUE);
	    System.out.println("Min int value    = " + Integer.MIN_VALUE);
	    System.out.println("Max int value    = " + Integer.MAX_VALUE);	    
	    System.out.println("Min long value    = " + Long.MIN_VALUE);
	    System.out.println("Max long value    = " + Long.MAX_VALUE);
	    System.out.println("Min float value  = " + Float.MIN_VALUE);
	    System.out.println("Max float value  = " + Float.MAX_VALUE);
	    System.out.println("Min double value = " + Double.MIN_VALUE);
	    System.out.println("Max double value = " + Double.MAX_VALUE);
	    System.out.println("Min char value = " + Character.MIN_VALUE);
	    System.out.println("Max char value = " + Character.MAX_VALUE);
	    
	    var nums = new int[]{1, 4, -2, 3};
	    var min = nums[0];
	    var max = nums[1];
	    for (int num : nums) {
	        if (num < min && num > max) {
	            min = num;
	            max = num;
	        }
	    }
	    System.out.println(min);
	    System.out.println(max);

}
}
