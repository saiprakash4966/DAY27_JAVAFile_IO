package com.bl;

public class JavaFile 
{
	
	    static int id = JavaFileMain.people.size();
	    private String Firstname;
	    private String Lastname;
	    private String phoneNumber;
	    private String email;
	    private String address;

	    JavaFile(String name, String surname, String phoneNumber, String email, String address) {
	        this.Firstname = Firstname;
	        this.Lastname = Lastname;
	        this.phoneNumber = phoneNumber;
	        this.email = email;
	        this.address = address;
	        id++;
	    }

	    String getFirstName() {
	        return Firstname;
	    }

	    String getLastName() {
	        return Lastname;
	    }

	    String getPhoneNumber() {
	        return phoneNumber;
	    }

	    String getEmail() {
	        return email;
	    }

	    String getAddress() {
	        return address;
	    }

	    @Override
	    public String toString() {
	        return "\n\nfirstName: " + getFirstName() + "\nlastname: " + getLastName() + "\nPhone number: " + getPhoneNumber() + "\nEmail: " +
	                getEmail() + "\nAddress: " + getAddress();
	    }
	    

}
