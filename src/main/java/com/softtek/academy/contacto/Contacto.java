package com.softtek.academy.contacto;

public class Contacto {
	private String id;
    private String firstName;
    private String lastName;
	private String motherName;
	private String email;
	private String phoneNumber;
	private ContactType contactType;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getMotherName() {
		return motherName;
	}
	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public ContactType getContactType() {
		return contactType;
	}
	public void setContactType(ContactType contactType) {
		this.contactType = contactType;
	}
	public Contacto() {
		this.contactType = ContactType.UNKNOWN;
    }
    public Contacto(String id, String firstName, String lastName, String motherName, String email, String phoneNumber,
			ContactType contactType) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.motherName = motherName;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.contactType = contactType;
	}
	@Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("nombre: "+this.getFirstName()+"\n");
        sb.append("Telefono: "+this.getPhoneNumber()+"\n");
        return sb.toString();
    }
}
