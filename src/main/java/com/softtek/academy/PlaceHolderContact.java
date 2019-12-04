package com.softtek.academy;

import com.softtek.academy.contacto.*;

public class PlaceHolderContact {
	private contacto;
	
	public static void main(String [] args) {
        Contacto contacto = new  Contacto();
        contacto.setFirstName("Rafael");
        contacto.setLastName("may");
        contacto.setMotherName("Denice");
        contacto.setEmail("rafamay_96@hotmail.com");
        contacto.setPhoneNumber("251681321654");
        System.out.println(contacto);

	}

}
