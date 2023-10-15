package Seminar4.HW4;

public class BookService implements BookRepository{
    @Override
    public String getBoockInfo(ISBN isbn) {
        return "Какая я то ннига";
    }
}
