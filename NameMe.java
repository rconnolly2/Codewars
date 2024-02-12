public class NameMe {
    private String firstName;
    private String lastName;
    private String fullName;


    public NameMe(String first, String last) {
        this.firstName = first;
        this.lastName = last;
        this.fullName = first+" "+last;
   }
  
    public String getLastName() {
      return this.lastName;
    }
  
    public String getFirstName() {
      return this.firstName;
    }
  
    public String getFullName() {
      return this.fullName;
    }

    public static void main(String[] args) {
        NameMe obj1 = new NameMe("Robert", "Connolly");
        obj1.
    }
 }