package LeetCode;
import java.util.ArrayList;

public class MobilePhone {
	private String myNumber;
	private ArrayList<Contacts> myContacts;
	public MobilePhone(String myNumber) {
		//super();
		this.myNumber = myNumber;
		this.myContacts = new ArrayList<Contacts>();
	}
	public boolean addNewContact(Contacts contact) {
		if(findContact(contact.getName())>=0) {
			System.out.println("Contact already exits");
			return false;
		}
		myContacts.add(contact);
		return true;
	}
	
	public boolean updateContact(Contacts oldContact, Contacts newContact) {
		int findPosition = findContact(oldContact);
		if(findPosition<0) {
			System.out.println(oldContact.getName() +" is not found");
			return false;
		}
		this.myContacts.set(findPosition, newContact);
		System.out.println(oldContact.getName() + "is replaced with " +newContact.getName());
		return true;
			
	}
	
	private int findContact(Contacts contact) {
		return this.myContacts.indexOf(contact);
	}
	
	private int findContact(String contactName) {
		for(int i=0;i<this.myContacts.size();i++) {
			Contacts contact = this.myContacts.get(i);
			if(contact.getName().equals(contactName))
				return i;
		}
		return -1;
	}
	
}
