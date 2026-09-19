package Projects;
//Parent Class
class User
{
    private int userId;
    private String userName;
    private String userEmail;
    private String contact;

    //getter setter to hold the data

    public int getUserId() {
        return userId;
    }
    public void setUserId(int userId) {
        this.userId = userId;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getUserEmail() {
        return userEmail;
    }
    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }
    public String getContact() {
        return contact;
    }
    public void setContact(String contact) {
        this.contact = contact;
    }
    
}

class Admin extends User //Inheritance
{
    private String bondDoc;
    private int salary;
}

class Member extends User //inheritance
{
    private int depositAmount;
    private int nBookIssued;
}

class ValidateUser
{
    void validateUser(User user) //passed the User reference to achieve the method ovverriding and Loose Coupling
    {
        if(user.getUserEmail().equals("admin@gmail.com") && user.getContact().equals("12345"))
        {
            System.out.println("Admin Login Successful");
        }
        else if(user.getUserEmail().equals("member@gmail.com") && user.getContact().equals("1234"))
        {
            System.out.println("Member Login Successful");
        }
        else
        {
            System.out.println("Invalid Credentials");
        }
    }
}

public class LibraryApp {
    public static void main(String[] args) {
        User user = new Admin();    //Upcasting
        ValidateUser vu = new ValidateUser();
        //set the data for admin
        user.setUserEmail("admin@gmail.com"); 
        user.setContact("12345");
        vu.validateUser(user);
        //set the data for member
        
        user=new Member();
        user.setUserEmail("member@gmail.com");
        user.setContact("1234");
        vu.validateUser(user);
    }
}
