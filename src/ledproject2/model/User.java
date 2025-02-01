package ledproject2.model;

public class User {
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String address;
    private String phone;

    public User(String firstName, String lastName, String email, String password, String address, String phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.address = address;
        this.phone = phone;
    }

    // Getters
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getEmail() { return email; }
    public String getPassword() { return password; }
    public String getAddress() { return address; }
    public String getPhone() { return phone; }
}
