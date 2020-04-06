package tpsi.web;

public final class Person {
    
    private String firstName;
    private String lastName;
    private String email;

    public Person(String firstName, String lastName, String email){
        
        setFirstName(firstName);
        setLastName(lastName);
        setEmail(email);
    }
    
    public String getFirstName() {
        return firstName;
    }

    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    
    public String getLastName() {
        return lastName;
    }

    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    
    public String getEmail() {
        return email;
    }

    
    public void setEmail(String email) {
        this.email = email;
    }
    
}
