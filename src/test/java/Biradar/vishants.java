package Biradar;
interface vishant{
    default void m1()
    {
       System.out.println("Thise is m1 default metode");
    }
    static void m2()
    {
        System.out.println("This is m2 static methode");
    }
}
interface ramesh{
   default void m1()
    {
       System.out.println("Thise is m1 default metode");
    }
    static void m2()
    {
        System.out.println("This is m2 static methode");
    } 
}
class suresh implements vishant,ramesh{
	@Override
	public void m1() {
		// TODO Auto-generated method stub
		ramesh.super.m1();
		vishant.super.m1();
	}
}
public class vishants {
    public static void main(String[] args) {
		suresh sr=new suresh();
		sr.m1();
		vishant.m2();
		ramesh.m2();
	}
    
}
