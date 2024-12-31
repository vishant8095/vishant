package pageObjects;

 class two{
	 two()
	 {
		 System.out.println(2);
	 }
 }
class three extends two{
	three()
	{
		System.out.println(3);
	}
}

public class one {

	public static void main(String[] args) {
		
new three();
	}

}
