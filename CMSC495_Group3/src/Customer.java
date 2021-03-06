
public class Customer {

  private static int numCustomers = 0;
  
  private String firstName;
  private String lastName;
  private String address1;
  private String address2;
  private String email;
  private String username;
  private String password;
  private int creditCard;
  private String cardExp;
  
  public Customer() {
    
  }
  
  public Customer(String firstName, String lastName, String address1, String address2, String email,
      String username, String password) {
    
    this.firstName = firstName;
    this.lastName = lastName;
    this.address1 = address1;
    this.address2 = address2;
    this.email = email;
    this.username = username;
    this.password = password;
    numCustomers += 1;
    
  }
  
  public Customer(String firstName, String lastName, String address1, String address2, String email,
      String username, String password, int creditCard, String cardExp) {
    
    this.firstName = firstName;
    this.lastName = lastName;
    this.address1 = address1;
    this.address2 = address2;
    this.email = email;
    this.username = username;
    this.password = password;
    this.creditCard = creditCard;
    this.cardExp = cardExp;
    numCustomers += 1;
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

  public String getAddress1() {
    return address1;
  }

  public void setAddress1(String address1) {
    this.address1 = address1;
  }

  public String getAddress2() {
    return address2;
  }

  public void setAddress2(String address2) {
    this.address2 = address2;
  }
  
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public int getCreditCard() {
    return creditCard;
  }

  public void setCreditCard(int creditCard) {
    this.creditCard = creditCard;
  }

  public String getCardExp() {
    return cardExp;
  }

  public void setCardExp(String cardExp) {
    this.cardExp = cardExp;
  }

  public static int getNumCustomers() {
    return numCustomers;
  }
  
  
  
  
  
}
