package Seminar3.HW3.TDD;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    public User user1= new User("Василий","123",true);
    public User user2= new User("Анна","1123",false);
    public User user3= new User("Дмитрий","123",false);

    @BeforeEach
    public void setUp(){

    }

    @Test
    void getName() {
        assertEquals("Василий",user1.getName());
        assertEquals("Анна",user2.getName());
        assertEquals("Дмитрий",user3.getName());
    }

    @Test
    void isAdmin() {
        assertEquals(true,user1.isAdmin());
        assertEquals(false,user2.isAdmin());
        assertEquals(false,user3.isAdmin());
    }

    @Test
    void isAuthenticate() {
        user1.authenticate("123");
        assertEquals(true, user1.isAuthenticate());
        assertEquals(false, user2.isAuthenticate());
        assertEquals(false, user3.isAuthenticate());
    }


    @Test
    void deAuthenticate() {
        user1.authenticate("123");
        assertEquals(true, user1.isAuthenticate());
        user1.deAuthenticate();
        assertEquals(false, user1.isAuthenticate());

    }
}