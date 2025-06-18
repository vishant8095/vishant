package newpack;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class class2 {
    @BeforeClass
  void s1()
  {
	  System.out.println("Thise is s1");
  }
    @Test
  void s2()
  {
	  System.out.println("Thise is s2");
  }
    @AfterClass
  void s3()
  {
	  System.out.println("Thise is s3");
  }
    @Test
    void m4()
    {
  	  System.out.println("Thise is s4");
    }
    @BeforeTest
    void s5()
    {
  	  System.out.println("Thise is s5");
    }
    @AfterTest
    void s6()
    {
  	  System.out.println("Thise is s6");
    }
}
