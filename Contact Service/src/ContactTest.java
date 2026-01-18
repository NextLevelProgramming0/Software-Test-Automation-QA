
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/* method to test each variable */
class ContactTest {
    Contact contact = new Contact("1", "firstName", "lastName", "123456789", "fake street 2101"); // making the object as a class member so that all the methods can access it


    @Test
    void getContactID() {
        assertEquals("1", contact.getContactID());
    }


	@Test
    void getFirstName() {
        assertEquals("firstName", contact.getFirstName());
    }

    @Test
    void getLastName() {
        assertEquals("lastName", contact.getLastName());
    }

    @Test
    void getPhone() {
        assertEquals("123456789", contact.getPhone());
    }

    @Test
    void getNumberAddress() {
        assertEquals("fake street 2101", contact.getNumberAddress());
    }

    @Test
    void testToString() {
        assertEquals("Contact [contactID=1, FirstName=firstName, LastName=lastName, phone=123456789, NumberAddress=fake street 2101]", contact.toString());
    }

}