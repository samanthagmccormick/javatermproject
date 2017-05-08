package termproject;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class User {
  private String name;
  private String birthdate;
  private String city;
  private boolean isSingle;
  private String partnerName;
  private String partnerGender;
  private int monthsUntilDeath;

  // no-arg constructor sets default values for class variables
  public User() {
    setName("");
    setBirthdate("");
    setCity("");
    setIsSingle(true);
    setPartnerName("");
    setPartnerGender("");
    setMonthsUntilDeath(0);
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

  public int getMonthsUntilDeath() {
    return monthsUntilDeath;
  }

  public void setMonthsUntilDeath(int comboboxIndex) {
    int monthsUntilDeath = 0;

    switch (comboboxIndex) {
      case 0:
        // now
        monthsUntilDeath = 0;
        break;
      case 1:
        // 6 months
        monthsUntilDeath = 6;
        break;
      case 2:
        // 1 year
        monthsUntilDeath = 12;
        break;
      case 3:
        // random amt of time
        monthsUntilDeath = (int) (Math.random() * 100);
        break;
      default:
        monthsUntilDeath = 0;
    }

    this.monthsUntilDeath = monthsUntilDeath;
  }

  public String getDeathdate() {
    // return today's date plus time until death, millis
    SimpleDateFormat sdf = new SimpleDateFormat("M/dd/yyyy");

    Calendar calendar = new GregorianCalendar();
    calendar.add(Calendar.MONTH, this.monthsUntilDeath);
    return sdf.format(calendar.getTime());
  }


}
