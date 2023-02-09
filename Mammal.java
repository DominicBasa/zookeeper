//Pair program with Rochelle B.
//Create a Mammal class that had an energy level memeber variable and displayEnergy() method.

public class Mammal {

  private int energyLevel = 100;

  public int displayEnergy() {
    System.out.println(this.energyLevel);
    return this.energyLevel;
  }

  //allows changes to energy level
  public int getEnergyLevel() {
    return this.energyLevel;
  }

  public void setEnergyLevel(int energyLevel) {
    this.energyLevel = energyLevel;
  }

  private int batEnergyLevel = 300;
    public int displayBatEnergy() {
      System.out.println(this.batEnergyLevel);
      return this.batEnergyLevel;
    } 

    public int getBatEnergy() {
      return this.batEnergyLevel;
    }
    
    public void setBatEnergyLevel(int batEnergyLevel) {
      this.batEnergyLevel = batEnergyLevel;
    }
}
