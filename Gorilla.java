public class Gorilla extends Mammal {
  public void throwSomething() {
    this.setEnergyLevel(getEnergyLevel()-5);
    System.out.printf("Thanks for throwing that tire, energy level is now: %d%n", this.displayEnergy());
  } 

  public void eatBananas() {
    this.setEnergyLevel(getEnergyLevel()+10);
    System.out.printf("Food has brought enery level back to: %d%n", this.displayEnergy());
  }

  public void climb() {
    this.setEnergyLevel(getEnergyLevel()-10);
    System.out.printf("This climbing wore me out boy energy is now: %d%n", this.displayEnergy() );
  }
}
