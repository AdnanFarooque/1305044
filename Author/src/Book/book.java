package Book;

/**
 * Created by Dipta on 9/18/2015.
 */
public class book {
    private String name;
    private Author author;
    private double price;
    private int stock;
    public book(String name, Author author, double price, int stock)
    {
        this.name = name;
        this.author = author;
        this.price = price;
        this.stock = stock;
    }
    public book(String name, Author author)
    {
        this.name = name;
        this.author = author;
    }
    public void setPrice(double price)
    {
        this.price = price;
    }
    public void setStock(int stock)
    {
        this.stock = stock;
    }
    public String getName()
    {
        return name;
    }
    public Author getAuthor()
    {
        return author;
    }
    public String getAuthorName()
    {
        return author.getName();
    }
    public double getPrice()
    {
        return price;
    }
    public int getStock()
    {
        return stock;
    }
    public void borrowBook(int amount)
    {
        if (stock >= amount) {
            stock -= amount;
        } else {
            System.out.println("Borrowing amount exceeds the current stock!");
        }
    }
    public void returnBook(int amount)
    {
        stock += amount;
    }
    public void print()
    {
        System.out.println("Author: " + getAuthorName() + " Name: " + name + " Price: " + price + " Stock: " + stock);
    }
}
