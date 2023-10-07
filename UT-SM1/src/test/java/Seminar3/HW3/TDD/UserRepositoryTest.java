package Seminar3.HW3.TDD;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserRepositoryTest {

    public User user1;
    public User user2;
    public User user3;

    public UserRepository repository;

    @BeforeEach
    public void setUp(){
        user1= new User("Василий","123",true);
        user2= new User("Анна","1123",false);
        user3= new User("Дмитрий","321",false);
        repository=new UserRepository();
        repository.addUser(user1);
        repository.addUser(user2);
        repository.addUser(user3);
    }

    @Test
    void addUser() {
        assertTrue(!repository.addUser(user1));
        assertTrue(repository.addUser(new User("Надеджа","234",false)));
    }

    @Test
    void delogAllWithoutAdmins() {
        user1.authenticate("123");
        user2.authenticate("1123");
        user3.authenticate("321");

        assertTrue(user1.isAuthenticate());
        assertTrue(user2.isAuthenticate());
        assertTrue(user3.isAuthenticate());

        repository.delogAllWithoutAdmins();

        assertTrue(user1.isAuthenticate());
        assertTrue(!user2.isAuthenticate());
        assertTrue(!user3.isAuthenticate());

    }

    @Test
    void findByName() {
        assertTrue(!repository.findByName("213123"));
        assertTrue(repository.findByName("Василий"));
    }
}