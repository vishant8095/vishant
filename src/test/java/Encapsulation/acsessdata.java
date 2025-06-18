package Encapsulation;

public class acsessdata {

	public static void main(String[] args) {
        userdata ud=new userdata();
      ud.setaccno(100);
      System.out.println( ud.getaccno()); 
      ud.setname("vishant");
      System.out.println(ud.getname());
      ud.setAmount(2000);
     System.out.println( ud.getAmount());

	}

}
