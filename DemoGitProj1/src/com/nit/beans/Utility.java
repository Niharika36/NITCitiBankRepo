package com.nit.beans;

import java.util.Date;

public class Utility {
	public Date getByDate() {
		return new Date();
	}
	
	public void m1() {
		System.out.println("m1() Utility....1234");
		System.out.println("DEV2 here!");
	}
	
	public void m2() {
		System.out.println("Dev1 COMPLETED m2() Utility.");
	}
//<<<<<<< HEAD
	
	public void m4() {
		System.out.println("Dev1 COMPLETED m4() Utility.");
	}
//=======
public void m3() {
	System.out.println(" INCOMPLETED m3() Utility.");
	System.out.println(" INCOMPLET m3() is NOW COMPLETE.");
}
//>>>>>>> stash
}