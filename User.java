package termproject;

public class User {
  private String name;
  private String birthdate;
  private String city;
  private boolean isSingle;
  private String partnerName;
  private String partnerGender;
  private int timeUntilDeath;
  
  // no-arg constructor sets default values for class variables
  public User() {
    setName("");
    setBirthdate("");
    setCity("");
    setIsSingle(true);
    setPartnerName("");
    setPartnerGender("");
    setTimeUntilDeath(0);
  }

  public void setName(String name) {
    this.name = name;
  }
  
  public String getName() {
    return name;
  }
  
  public void setBirthdate(String birthdate) {
    this.birthdate = birthdate;
  }
  
  public String getBirthdate() {
    return birthdate;
  }
  
  public void setCity(String city) {
    this.city = city;
  }
  
  public String getCity() {
    return city;
  }

  public boolean getIsSingle() {
    return isSingle;
  }

  public void setIsSingle(boolean isSingle) {
    this.isSingle = isSingle;
  }

  public String getPartnerName() {
    return partnerName;
  }

  public void setPartnerName(String partnerName) {
    this.partnerName = partnerName;
  }

  public String getPartnerGender() {
    return partnerGender;
  }

  public void setPartnerGender(String partnerGender) {
    this.partnerGender = partnerGender;
  }

  public int getTimeUntilDeath() {
    return timeUntilDeath;
  }

  public void setTimeUntilDeath(int timeUntilDeath) {
    this.timeUntilDeath = timeUntilDeath;
  }
  
}
