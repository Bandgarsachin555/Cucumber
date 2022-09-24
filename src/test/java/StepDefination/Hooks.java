package StepDefination;



import BaseLayer.BaseClass;
import io.cucumber.java.Before;

public class Hooks extends BaseClass{

	
	@Before
	public void abc()
	{
		System.out.println("before hooks");
	}
	
	
}
