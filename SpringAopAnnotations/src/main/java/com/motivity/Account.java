package com.motivity;

import org.springframework.stereotype.Component;

@Component()
public class Account implements SbiBank {

	public void hiwithdraw() {
		System.out.println("Money is withdrawing");
		
	}
	
	public void hiaddMoney()
	{
		System.out.println("money added");
	}
	
	public void hideposit() {
		System.out.println("Deposit is done");
		
	}

}
