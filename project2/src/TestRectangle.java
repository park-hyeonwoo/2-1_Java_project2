public class TestRectangle {
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(1.0f, 1.0f);
		Rectangle r2 = new Rectangle(1.0f, 2.0f);
		Rectangle r3 = new Rectangle(2.0f, 1.0f);
		
		 if ( r2.equal(r2, r3) )
			 System.out.println("two rectangles are equal.");
		   else
			 System.out.println("two rectangles are different.");

		   if ( r2.compare(r2, r3) > 0 )
			 System.out.println("the first is larger than the second.");
		   else if ( r2.compare(r2, r3) < 0 )
			 System.out.println("the first is smaller than the second.");
		   else
			 System.out.println("two are the same in area.");
		   
		   r1.print();
		   r1.resize(r1, 2.0f);
		   r1.print();
     }
}