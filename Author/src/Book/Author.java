package Book;

/**
 * Created by Dipta on 9/18/2015.
 */
public class Author {
    private String name;
    private  String email;
    public Author()
    {

    }
    public Author(String name, String email)
    {
        this.name = name;
        setEmail(email);
    }
    public Author(String name)
    {
        this.name = name;
    }
    public void setEmail(String email)
    {
        this.email = email;
    }
    public String getName()
    {
        return name;
    }
    String getEmail()
    {
        return email;
    }

    public void print()
    {
        System.out.println(name + " at " + email);
    }
};

