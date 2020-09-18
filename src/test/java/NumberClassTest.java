import org.junit.Test;

import junit.framework.Assert;

public class NumberClassTest {

  private NumberClass obj;
  
  @Test
  public void OneNumber() {
	obj=new NumberClass();
    Assert.assertEquals("1", obj.convert(1));
  }

  @Test
  public void TwoNumber() {
	obj=new NumberClass();
    Assert.assertEquals("1", obj.convert(1));
    Assert.assertEquals("2", obj.convert(2));
  }
  
  @Test
  public void ThreeReturnBuzz() {
	obj=new NumberClass();
    Assert.assertEquals("1", obj.convert(1));
    Assert.assertEquals("2", obj.convert(2));
    Assert.assertEquals("Fizz", obj.convert(3));

  }
  
  @Test
  public void FiveReturnFizz() {
	obj=new NumberClass(); 
    Assert.assertEquals("1", obj.convert(1));
    Assert.assertEquals("2", obj.convert(2));
    Assert.assertEquals("Fizz", obj.convert(3));
    Assert.assertEquals("Buzz", obj.convert(5));

  }
  
  @Test
  public void MultipleOfFifteen() {
	obj=new NumberClass();
    Assert.assertEquals("1", obj.convert(1));
    Assert.assertEquals("2", obj.convert(2));
    Assert.assertEquals("Fizz", obj.convert(3));
    Assert.assertEquals("Buzz", obj.convert(5));
    Assert.assertEquals("FizzBuzz", obj.convert(15));

  }
   
  @Test
  public void show() {
	obj=new NumberClass();
	for(int i=1;i<=50;i++) {
		System.out.println(obj.convert(i));
	}
  }
}

  
  
  
  