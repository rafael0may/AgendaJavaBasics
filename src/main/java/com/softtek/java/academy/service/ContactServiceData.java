  
//Project Agenda
package com.softtek.java.academy.service;

import com.softtek.academy.contacto.*;

public interface ContactServiceData {
	public Contact createContact(Contact contact);
	public boolean updateContact(String id,Contact contact);
	public boolean deletecontact(String id);
	public Contact[] findAll();
	public Contact findByID(String id);
	public Contact findByEmail(String email);
	public Contact[] findByContactType(ContactType contactType);
}