package StepDefination;

import org.junit.Before;

import BaseLayer.BaseClass;

public class Hooks extends BaseClass{

	
	@Before
	public void abc()
	{
		System.out.println("before hooks");
	}
	
	
}
