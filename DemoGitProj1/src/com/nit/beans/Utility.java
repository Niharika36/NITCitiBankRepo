package com.nit.beans;

import java.util.Date;

public class Utility {
	public Date getByDate() {
		return new Date();
	}
	public static void main(String[] args) {
		System.out.println("DATE:"+new Utility().getByDate());
	}

}
