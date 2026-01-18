
public class Contact {
    /* member variables */
    private String contactID;
    private String firstName;
    private String lastName;
    private String phone;
    private String numberAddress;

    /* parameterized constructor */
    public Contact(String contactID, String firstName, String lastName, String phone, String numberAddress) {
        //The requirement for contactID is that it not be null and it cannot be longer than 10 characters
    	if(contactID == null || contactID.length()>10) {
    		throw new IllegalArgumentException("Invalid input");
    	}
    	//The requirement for name is that it not be null and it cannot be longer than 10 characters
    	if(firstName == null || firstName.length()>10) {
    		throw new IllegalArgumentException("Invalid input");
    	}
    	//The requirement for description is that it not be null and it cannot be longer than 10 characters	
    	if(lastName == null || lastName.length()>10) {
    		throw new IllegalArgumentException("Invalid input");
    	}
    	//The requirement for description is that it not be null and it cannot be longer than 10 characters	
        if(phone == null || phone.length()!=10) {
            throw new IllegalArgumentException("Invalid input");
        }
        //The requirement for description is that it not be null and it cannot be longer than 10 characters	
        if(numberAddress == null || numberAddress.length()>30) {
            throw new IllegalArgumentException("Invalid input");
        }
            	
        	
    	
    	this.contactID = contactID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.numberAddress = numberAddress;
    }

    /* setters and getters */
    public String getContactID() {
        return contactID;
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
    public String getPhone() {
    	return phone;
    }
    public void setPhone(String phone) {
    	this.phone = phone;
    }

    public String getNumberAddress() {
        return numberAddress;
    }

    public void setNumberAddress(String numberAddress) {
        this.numberAddress = numberAddress;
    }

    /* method to check if two contacts are same or not */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Contact other = (Contact) obj;
        if (contactID == null) {
            if (other.contactID != null)
                return false;
        }
        else if (!contactID.equals(other.contactID))
            return false;
        if (firstName == null) {
            if (other.firstName != null)
                return false;
        }
        else if (!firstName.equals(other.firstName))
            return false;
        if (lastName == null) {
            if (other.lastName != null)
                return false;
        }
        else if (!lastName.equals(other.lastName))
            return false;
        if (phone == null) {
            if (other.phone != null)
                return false;
        }
        else if (!phone.equals(other.phone))
            return false;
        if (numberAddress == null) {
            if (other.numberAddress != null)
                return false;
        }
        else if (!numberAddress.equals(other.numberAddress))
            return false;
        return true;
        }
}