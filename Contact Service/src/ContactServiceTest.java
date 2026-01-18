import static org.junit.Assert.*;
import org.junit.Test;

/*This Junit Class will help to test ContactService class and its methods*/
public class ContactServiceTest {

/* testing the add method to work fine, when details provided should work */
    @Test
    public void testMethodAddPass() {
        ContactService cs = new ContactService();
        Contact c1 = new Contact("C001", "Jake", "Boss", "3564578793", "1912 Barry RD");
        Contact c2 = new Contact("C002", "Justin", "Boss", "3564578793", "1912 Barry RD");
        Contact c3 = new Contact("C003", "Jacob", "Boss", "3564578793", "1912 Barry RD");
        assertEquals(true, cs.add(c1));
        assertEquals(true, cs.add(c2));
        assertEquals(true, cs.add(c3));
    }

    /* testing the add method to work fine,when details provided should not work */
    @Test
    public void testMethodAddFail() {
        ContactService cs = new ContactService();
        Contact c1 = new Contact("C001", "Jake", "Boss", "3564578793", "1912 Barry RD");
        Contact c2 = new Contact("C002", "Justin", "Boss", "3564578793", "1912 Barry RD");
        Contact c3 = new Contact("C003", "Jacob", "Boss", "3564578793", "1912 Barry RD");
        assertEquals(true, cs.add(c1));
        assertEquals(false, cs.add(c1));
        assertEquals(true, cs.add(c3));
        assertEquals(true, cs.add(c2));
    }

    /* test the delete method */
    @Test
    public void testMethodDeletePass() {
        ContactService cs = new ContactService();
        Contact c1 = new Contact("C001", "Jake", "Boss", "3564578793", "1912 Barry RD");
        Contact c2 = new Contact("C002", "Justin", "Boss", "3564578793", "1912 Barry RD");
        Contact c3 = new Contact("C003", "Jacob", "Boss", "3564578793", "1912 Barry RD");
        assertEquals(true, cs.add(c1));
        assertEquals(true, cs.add(c2));
        assertEquals(true, cs.add(c3));

        assertEquals(true, cs.remove("C003"));
        assertEquals(true, cs.remove("C002"));
    }

    /* test the delete method */
    @Test
    public void testMethodDeleteFail() {
        ContactService cs = new ContactService();
        Contact c1 = new Contact("C001", "Jake", "Boss", "3564578793", "1912 Barry RD");
        Contact c2 = new Contact("C002", "Justin", "Boss", "3564578793", "1912 Barry RD");
        Contact c3 = new Contact("C003", "Jacob", "Boss", "3564578793", "1912 Barry RD");
        assertEquals(true, cs.add(c1));
        assertEquals(true, cs.add(c3));
        assertEquals(true, cs.add(c2));

        assertEquals(false, cs.remove("C004"));
        assertEquals(true, cs.remove("C002"));
    }

    /* test the update method */
    @Test
    public void testUpdatePass() {
        ContactService cs = new ContactService();
        Contact c1 = new Contact("C001", "Jake", "Boss", "3564578793", "1912 Barry RD");
        Contact c2 = new Contact("C002", "Justin", "Boss", "3564578793", "1912 Barry RD");
        Contact c3 = new Contact("C003", "Jacob", "Boss", "3564578793", "1912 Barry RD");
        assertEquals(true, cs.add(c1));
        assertEquals(true, cs.add(c3));
        assertEquals(true, cs.add(c2));

        assertEquals(true, cs.update("C003", "Jimmy", "Dean", ""));
        assertEquals(true, cs.update("C002", "James", "Bush", "879 Loalan AVE"));
    }

    /* test the update method */
    @Test
    public void testUpdateFail() {
        ContactService cs = new ContactService();
        Contact c1 = new Contact("C001", "Jake", "Boss", "3564578793", "1912 Barry RD");
        Contact c2 = new Contact("C002", "Justin", "Boss", "3564578793", "1912 Barry RD");
        Contact c3 = new Contact("C003", "Jacob", "Boss", "3564578793", "1912 Barry RD");
        assertEquals(true, cs.add(c1));
        assertEquals(true, cs.add(c3));
        assertEquals(true, cs.add(c2));

        assertEquals(false, cs.update("C003", "Jimmy", "Dean", ""));
        assertEquals(true, cs.update("C002", "James", "Bush", "879 Loalan AVE"));
    }

}