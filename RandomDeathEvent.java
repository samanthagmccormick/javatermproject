package termproject;

public class RandomDeathEvent {
  static String[] randomDeathEventList = {
      // city
      "when a gamma ray burst suddenly obliterated the city of [city]",
      "when a dam suddenly burst and swept the entire town of [city] inhabitants away",
      "when a noxious chemical spill contaminated the local water supply in [city]",
      "when a subterranean volcano spontaneously erupted into the city of [city]",
      "when a biochemical warfare agent was accidentally released into the city of [city]",

      // partner
      "when [partnerName] accidentally detonated a landmine",
      "when [partnerName] mistakenly lit them on fire",
      "when accidentally startling [partnerName] as they were picking up a WWII-era grenade",
      "when accidentally walking in on [partnerName] who was playing with machetes purchased on Ebay",
      "when [partnerName] accidentally set their campsite on fire and had broken their tent zipper earlier that night"};

  public static String getRandomDeathEvent(int randomNumber, String city, String partnerName) {
    return randomDeathEventList[randomNumber].replace("[city]", city).replace("[partnerName]",
        partnerName);
  }
}
