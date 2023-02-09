public class Bat extends Mammal {
  public void fly() {
    this.setBatEnergyLevel(getEnergyLevel()-50);
    System.out.printf("Taking flight! Energy level is now: %d%n", this.displayBatEnergy());
  }

  public void eatHumans() {
    this.setBatEnergyLevel(getEnergyLevel()+25);
    System.out.printf("Mmmm brains energy level is now: %d%n", this.displayBatEnergy());
  }

  public void attackTown() {
    this.setBatEnergyLevel(getEnergyLevel()-100);
    System.out.printf("The end is near energy level is now: %d%n", this.displayBatEnergy());
  }
}
