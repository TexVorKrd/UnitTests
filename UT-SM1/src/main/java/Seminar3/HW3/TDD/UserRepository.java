package Seminar3.HW3.TDD;

import java.util.ArrayList;
import java.util.List;


//Добавьте функцию в класс UserRepository, которая разлогинивает всех пользователей,
//кроме администраторов. Для этого, вам потребуется расширить класс User новым свойством,
//указывающим, обладает ли пользователь админскими правами. Протестируйте данную функцию.
public class UserRepository {

    // Тут можно хранить аутентифицированных пользователей
    private List<User> data = new ArrayList<>();

    public boolean addUser(User user) {
        boolean isMatch=  this.data.stream()
                .filter(a->a.equals(user))
                .count()>0;

        if (!isMatch){
            data.add(user);
            return true;
        }
        return false;
    }

    public void delogAllWithoutAdmins(){
        this.data.stream()
                .filter(a->!a.isAdmin())
                .forEach(a->a.deAuthenticate());
    }

    public boolean findByName(String username) {
        for (User user : data) {
            if (user.getName().equals(username)) {
                return true;
            }
        }
        return false;
    }
}
